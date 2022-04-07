package JumpToJava.jumptojava.chap03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q9 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
    System.out.println(numbers);

    // 1
    HashSet<Integer> setNumbers = new HashSet<>();

    for(Integer number: numbers) {
      setNumbers.add(number);
    }

    System.out.println(setNumbers);

    // 2
    HashSet<Integer> setNumbers2 = new HashSet<>(numbers);
    System.out.println(setNumbers2);
  }
}
