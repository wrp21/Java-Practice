package javaBasicSyntax;
import java.util.Scanner;

public class IoExam {
  public static void main(String[] args) {
    Scanner inputWord = new Scanner(System.in);
    Scanner inputLine = new Scanner(System.in);
    Scanner inputInteger = new Scanner(System.in);

    System.out.println(inputWord.next());
    System.out.println(inputLine.nextLine());
    System.out.println(inputInteger.nextInt());
  }
}