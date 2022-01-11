package Problem.jumptojava.chap03;
import java.util.HashMap;

// 과목별 점수가 주어졌을때 평균 점수
// 국어 80, 영어 75, 수학 55
public class Q1 {
  public static void main(String[] args) {
    HashMap<String, Integer> score = new HashMap<>();
    score.put("국어", 80);
    score.put("영어", 75);
    score.put("수학", 55);

    Integer sum = 0;
    
    System.out.println(score.values());

    for (Integer scoreValue: score.values()) {
      sum += scoreValue;
    }

    System.out.println(String.format("점수 총합 : %d\n점수 평균 : %f\n", sum, sum / (float)score.size()));
    
  }
}
