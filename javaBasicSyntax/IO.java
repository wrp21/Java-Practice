package javaBasicSyntax;

public class IO {
  public static void main(String[] args) {
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

    
  }
}