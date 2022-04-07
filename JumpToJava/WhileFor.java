package JumpToJava;

import java.util.Scanner;

public class WhileFor {
  public static void main(String[] args) {

    int i = 1;
    int j = 1;
    while (i <= 9) {
      while (j <= 9) {
        System.out.println(i + " x " + j + " = " + i * j);
        j++;
      }
      i++;
      j = 1;
      
    }
    
    System.out.println();

    for (i = 1; i < 10; i++) {
      for (j = 1; j < 10; j++) {
        System.out.println(i + " x " + j + " = " + i * j);
      }
    }


    String[] numbers = {"one", "two", "three"};
    for(i = 0; i<numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    // foreach
    for(String number: numbers) {
      System.out.println(number);
    }

    Scanner scanner = new Scanner(System.in);
    int input;
    int sum = 0;

    do {
      input = scanner.nextInt();
      sum += input;
    } while(input != 0);

    System.out.println(sum);

  }
  
}
