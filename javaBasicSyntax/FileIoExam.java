package javaBasicSyntax;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileIoExam {
  public static void main(String[] args) throws IOException{
    BufferedReader bfInput = new BufferedReader(new FileReader("output.txt"));
    while(true) {
      String line = bfInput.readLine();
      if (line == null) break;
      System.out.println(line);
    }
    bfInput.close();
  }
}