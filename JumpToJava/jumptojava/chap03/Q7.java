package JumpToJava.jumptojava.chap03;
import java.util.ArrayList;
import java.util.Arrays;

public class Q7 {
  public static void main(String[] args) {
    ArrayList<String> lstStrings = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
    System.out.println(lstStrings);
    System.out.println(String.join(" ", lstStrings));

  }
}
