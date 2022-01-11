package Problem.jumptojava.chap04;

public class Q5 {
  public static void main(String[] args) {
    int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
    int sum = 0;
    for(int mark: marks) {
      sum += mark;
    }
    System.out.println(sum / (float)marks.length);
  }
}
