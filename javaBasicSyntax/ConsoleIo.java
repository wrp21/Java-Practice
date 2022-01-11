package javaBasicSyntax;

import java.io.BufferedReader;
// java.lang 패키지에 속해 있지 않은 클래스는 import 해서 사용해야 한다.
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleIo {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello world");

    // 진법
    int num = 10;       // 10진법으로 10을 표현
    int bNum = 0B1010;  // 2진법 1010 => 10진법 : 10
    int oNum = 012;     // 8진법 12 => 10진법 : 10
    int xNum = 0XA;     // 16진법 A => 10진법 : 10

    // format을 지정하지 않으면 10진법으로 출력, format을 지정하여 출력하려면 printf를 사용하여야함
    System.out.println("num : " + num);
    System.out.println("bNum : " + bNum);
    System.out.println("oNum : " + oNum);
    System.out.println("xNum : " + xNum);

    // System.out.println 은  System.out.print, printf와 달리 줄 바꿈을 포함하고 있다
    System.out.println("");

    // printf 를 사용하여 format 지정하기
    System.out.printf("10 진법 으로 표현(num, bNum, oNum, xNum) : %d, %d, %d, %d \n", num, bNum, oNum, xNum);
    System.out.printf("8 진법 으로 표현 : %o, %o, %o, %o \n", num, bNum, oNum, xNum);
    System.out.printf("2 진법 으로 표현 : %b, %b, %b, %b \n", num, bNum, oNum, xNum);
    System.out.printf("16 진법 으로 표현 : %x, %x, %x, %x \n", num, bNum, oNum, xNum);


    // 콘솔은 사용자의 입력을 받거나 사용자에게 문자열을 출력해 주는 역활을 하는 것을 통칭
    // 윈도우 명령창, 인텔리제이의 콘솔창
    // 사용자에게 보여주는 것이 콘솔 출력
    // 사용자에게 입력을 받는 것이 콘솔 입력
    // 콘솔 입력

    // 콘솔 입력
    // java.io.InputStream import
    InputStream in = System.in; // System.in 은 InputStream 객체

    int a, b, c, d;

    // read 메소드로 읽은 1byte의 데이터는 byte 타입이 아닌 int 타입으로 저장된다.
    // 1byte만 읽기 때문에 "abc"를 입력해도 "a"만 읽을 수 있음
    // 사용자가 전달한 데이터("a"(1byte), "abc"(3byte)) 를  입력 스트림이라고 함.
    // 스트림은 이어져 있는 데이터(byte)의 형태를 의미한다.
    // 저장된 값은 0~255 사이의 아스키코드의 정수값
    // InputStream

    // 스트림에는 파일 데이터, HTTP 응답 데이터, 키보드 입력
    // 파일데이터 : 파일은 시작과 끝이 있는 데이터의 스트림
    // a = in.read(); // a를 누르고 엔터키를 누르면 입력이 종료되고 프로그램에 전달

    // System.out.println(a); // 97

    // InputStream in2 = System.in;


    // b = in2.read();
    // c = in2.read();
    // d = in2.read();

    // System.out.println(b);
    // System.out.println(c);
    // System.out.println(d);

    // InputStream in3 = System.in;

    // byte[] items = new byte[3];
    // in3.read(items);

    // System.out.println(items[0]);
    // System.out.println(items[1]);
    // System.out.println(items[2]);

    // InputStreamReader : InputStream과 달리 입력 문자의 아스키 코드가 아니라 문자 그대로 출력해준다.
    // java.io.InputStreamReader 를 import 해야한다.
    // InputStreamReader reader = new InputStreamReader(in);
    // char[] chItems = new char[3];
    // reader.read(chItems);

    // System.out.println(chItems);

    // BufferedReader : InputStream은 고정 길이만 입력받을 수 있지만
    // BufferedReader 는 엔터키 입력 전까지의 문자를 전부 받아들일 수 있다.
    // java.io.BufferedReader를 import 해야한다.
    InputStream in4 = System.in;
    InputStreamReader reader = new InputStreamReader(in4);
    BufferedReader br = new BufferedReader(reader);

    String lines = br.readLine();
    System.out.println(lines);  

    // InputStream - byte             // 입력받은 것의 ascii code를 정수로 출력함, 1바이트만 입력받을 수 있음, 고정길이 의 배열로 여러 문자를 받을 수 있음
    // InputStreamReader - character  // 문자로 출력함, 1바이트만 입력받을 수 있음, 고정길이 의 배열로 여러 문자를 받을 수 있음
    // BufferedReader - String        // readLine 메소드를 통해 고정길이가 아닌 문자열을 받을 수 있음


    // main 메소드에서 throws Exceptions : InputStream 으로부터 값을 읽어들일 때는 IOExceoption이 발생할 수 있음
    // throws로 그 예외처리를 뒤로 미룸

    // Scanner 
    // J2SE 5.0 부터 java.util.Scanner 클래스 추가됨
    // java.util.Scanner import
    // Scanner 클래스는 생성자의 입력으로 System.in, 즉 콘솔입력인 InputStream을 필요로 한다.
    // next 메소드 : 단어 하나(Token)을 읽어들임
    // nextLine : 라인
    // nextInt : 정수
    Scanner input = new Scanner(System.in);
    System.out.println(input.next());

    // 콘솔 출력
    // System.out.println, print, printf 을 사용할떄
    // System.out은 PrintStream 클래스의 객체이며 이 클래스는 콘솔에 값을 출력할 때 사용된다.
    // System.err 는 System.out과 동일한 역활을 하지만 System.err는 오류메시지를 출력할 경우에 사용
    


  
  }
}