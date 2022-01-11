package Problem.jumptojava.chap04;

public class Q2 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    while (count < 1000) {
      count += 1;
      if (count % 3 == 0 ) {
        sum += count;
      }
    }

    System.out.println(sum);
  }
  
}
