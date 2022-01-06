package javaBasicSyntax;

public class VariableDataType {
  public static void main (String[] args) {
    
    // 변수 이름은 영문 대소문자, 숫자, 특수문자 중 $, _ 를 사용할 수 있다
    // 변수 이름의 시작은 숫자로 할 수 없다
    // 예약어 사용 불가능(public, while, for, break, package, ...)
    // 변수 명명방법은 camelCase

    int camelCaseVariable = 10;
    int $_variable = 10;
    int variable123 = 123;
    int while123 = 123;
    int _while = 123;
    

    // 에러 발생
    // int #variable = 10;
    // int %variable = 10;
    // int while = 10;
    // int for = 10;
    // int 123Variable = 10;
    
    System.out.println(camelCaseVariable);
    System.out.println($_variable);
    System.out.println(while123);
    System.out.println(variable123);
    System.out.println(_while);

    // 데이터 타입
    // 기본 자료형(primitive data type)은 데이터가 변수에 직접 저장되고
    // 객체 자료형은 객체 메모리 주소가 변수에 저장된다 (reference)

    // 정수형 데이터 타입
    byte byteNumber = 10;   // 크기 1바이트
    short shortNumber = 10; // 크기 2바이트
    int intNumber = 10;     // 크기 4바이트, 기본적으로 숫자 리터럴은 int로 저장됨
    long longNumber = 10L;   // 크기 8바이트, long 타입의 리터럴을 표시해줘야함 

    System.out.println(byteNumber);
    System.out.println(shortNumber);
    System.out.println(intNumber);
    System.out.println(longNumber);

    System.out.println();

    // 실수형 데이터 타입
    float floatNum = 1234.1234F;
    double doubleNum = 1234.1234;
    
    System.out.println(floatNum);
    System.out.println(doubleNum);

    // 문자형 데이터 타입
    char chNumberA = 65; // utf-16 A
    char chNumberB = 66;
    char chChar   = 'A';
    char chSix = '6';

    System.out.println(chNumberA);
    System.out.println(chNumberB);
    System.out.println(chChar);
    System.out.println(chSix);

    // 논리형 데이터 타입
    boolean isTrue = true;
    boolean isFalse = false;

    System.out.println(isTrue);
    System.out.println(isFalse);

    // java 10에서 부터 지역변수이면 타입 추론이 가능하다
    var i = 10; // 정수형으로 추론
    var j = 10.0; // 
    var str = "hello";

    System.out.println(i);
    System.out.println(j);
    System.out.println(str);

    // final 명령어로 상수를 선언할 수 있음
    final int MAX_NUM = 100;
    final int MIN_NUM;
    MIN_NUM = 0;
    
    System.out.println(MAX_NUM);
    System.out.println(MIN_NUM);

    byte byteNum = 123;
    int intNum = byteNum;
    float fltNum = intNum;
    
    byteNum = (byte)fltNum;
    intNum = (int)byteNum;

    double dNum = 1.2;
    float fNum = 0.9F;
    
    int iNum1 = (int)dNum + (int)fNum;
    int iNum2 = (int)(dNum + fNum);
    // int iNum3 = (int)dNum + fNum; // type error
    System.out.println(iNum1);
    System.out.println(iNum2);
    // System.out.println(iNum3);


    System.out.println();

    byte num1 = 5;   // 00000101
    byte num2 = 10;  // 00001010


    System.out.println(num1 | num2); // 0000 0101 | 0000 1010 == 0000 1111 == 15
    System.out.println(num1 & num2); // 0000 0101 & 0000 1010 == 0000 0000 == 0
    System.out.println(num1 ^ num2); // 0000 0101 ^ 0000 1010 == 0000 1111 == 15
    System.out.println(~num1);       // ~(0000 0101) = 1111 1010

    System.out.println(num1 << 2);   // 0000 0101 << 2 == 0001 0100 == 
    System.out.println(num1);
    System.out.println(num1 <<= 2);
    System.out.println(num1);

    System.out.println();


    // 리터럴 방식 할당은 객체 생성 없이 고정된 값을 그대로 대입하는데 
    // 값을 intern pool 이라는 곳에 저장하고 
    // 다음에 다시 동일한 문자열이 선언될 경우 cache된 문자열을 리턴함.
    String text1 = "text";
    String text2 = "text";
    String text3 = new String("text");
    String text4 = "text4";
    System.out.println(text1.equals(text2));
    System.out.println(text1.equals(text3));
    System.out.println(text1 == text3);
    System.out.println(text1 == text4);

    String message = "I like Java";
    System.out.println(message.indexOf("like"));
    System.out.println(message.indexOf("w"));

    String msgHello = "Hello World";
    System.out.println(msgHello.contains("Hello"));
    System.out.println(msgHello.contains("hello"));
    System.out.println(msgHello.contains("Hll"));

    System.out.println(msgHello.charAt(0)); // H 출력
    System.out.println(msgHello.charAt(6)); // W 출력
    //System.out.println(msgHello.charAt(11)); // java.lang.StringIndexOutOfBoundsException: String index out of range

    
    System.out.println(msgHello.replaceAll("World", "World1"));
    System.out.println(msgHello.substring(0));
    System.out.println(msgHello.substring(6));
    System.out.println(msgHello.substring(0, 4));

    System.out.println(msgHello.toUpperCase());
    System.out.println(msgHello.toUpperCase());
    System.out.println(msgHello.toLowerCase());

    String msgNotSplit = "2022-01-01";
    String[] msgSplit = msgNotSplit.split("-");
    for(String element: msgSplit) {
      System.out.println(element);
    }

    
    
    



    
    



    


    

    

    


    




  }
}
