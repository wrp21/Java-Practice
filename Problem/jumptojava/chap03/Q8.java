package Problem.jumptojava.chap03;
import java.util.HashMap;
public class Q8 {
  public static void main(String[] args) {
    HashMap<String, Integer> grade = new HashMap<>();
    grade.put("A", 90);
    grade.put("B", 80);
    grade.put("C", 70);

    // remove는 key에 해당하는 Key-value 쌍을 지우고 지운 value 값을 반환
    System.out.println(grade.remove("B"));
  }
  
}
