package JumpToJava.jumptojava.chap03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q6 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
    System.out.println(numbers);
    
    numbers.sort(Comparator.reverseOrder());
    System.out.println(numbers);
  }
}
