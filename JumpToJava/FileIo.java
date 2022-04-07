package JumpToJava;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class FileIo {
  public static void main(String[] args) throws IOException {
    // FileOutputStream output = new FileOutputStream("c:/out.txt");

    // FileOutputStream 객체를 생성하려면 생성자의 입력으로
    // 파일명을 넘겨주어야 한다.
    // FileOutputStream 클래스는 OutputStream 클래스를 상속받아 만든 클래스이며 
    // OutputStream 클래스는 InputStream과 마찬가지로 바이트 단위로 데이터를 처리할 수 있다.
    // 따라서 FileOutputStream 또한 바이트 단위로 처리하기 때문에
    // String 을 byte 배열로 바꿔주어야 하며 이를 위해 getBytes() 매소드를 사용한다.  \r\n 필요, 유닉스에선 \n 사용
    FileOutputStream output = new FileOutputStream(("JumpToJava/outFileOutputStream.txt"));

    for(int i = 1; i<11; i++) {
      String data = i+" line \r\n";
      //
      output.write(data.getBytes());
    }

    output.close(); // 파일 객체를 닫아주지만 없어도 자바에서 프로그램이 종료될 때 사용한 파일 객체를 자동으로 닫아주기 때문


    // FileWriter
    // java.io.FileWriter;
    // FileOutputStream 과 달리 Byte 배열 대신 바로 문자열을 사용할 수 있음
    // 하지만 여전히 \r\n 필요

    FileWriter fw = new FileWriter("JumpToJava/outFileWriter.txt");
    for(int i = 0; i<11; i++) {
      String data2 = i+"line.\r\n";
      fw.write(data2);
    }
    fw.close();


    // PrintWriter
    // FileWriter와 달리 \r\n을 붙이는 대신 println 메소드를 사용
    // java.io.PrintWriter

    PrintWriter pw = new PrintWriter("JumpToJava/outPrintWriter.txt");
    for (int i = 0; i < 11; i++ ) {
      String data3 = i + " line.";
      pw.println(data3); // System.out 파일객체 대신 PrintWriter 객체를 사용한다.
    }
    pw.close();

    for (int i = 0; i < 11; i++) {
      String data5 = i + " line.";
      System.out.println(data5);
    }

    // 파일에 내용 추가하기
    // 이미 작성된 파일에 내용을 추가하려면
    // 추가모드로 열어서 내용 추가
    // FileWriter 객체로 두번째 파라미터를 주어 열어서 덮어쓰지 않고 추가모드로 열 수 있다. 

    FileWriter fw2 = new FileWriter("JumpToJava/outPrintWriter.txt", true);
    for (int i = 11; i < 23; i++) {
      String data6 = i + " line";
      fw2.write(data6);
    }
    fw2.close();

    // PrintWriter 객체로 추가하기
    PrintWriter pw2 = new PrintWriter(new FileWriter("JumpToJava/outPrintWriter.txt", true));
    for (int i = 22; i<33; i++) {
      String data7 = i + " line.";
      pw2.println(data7);
    }
    pw2.close();


    // 파일 읽기
    // FileInputStream
    // byte 배열을 이용하여 값을 읽기 때문에 정확한 길이를 알아야함
    byte[] b = new byte[1024];
    FileInputStream input = new FileInputStream("JumpToJava/outPrintWriter.txt");
    input.read(b);
    System.out.println(new String(b));
    input.close();

    // BufferedReader
    // FileInputStream 대신 BufferedReader의 클래스의 생성자에 FileReader 객체를 사용하면
    // BufferedReader 클래스의 readLine 메소드를 이용하여 라인 단위로 읽을 수 있기 때문에 
    // 파일의 정확한 길이를 몰라도 됨.
    // readLine 메소드는 읽을 라인이 없으면 null을 반환함
    BufferedReader br = new BufferedReader(new FileReader("JumpToJava/outPrintWriter.txt"));
    while(true) {
      String line = br.readLine();
      if (line == null) break;
      System.out.println(line);
    }
    br.close();

    

  }
}
