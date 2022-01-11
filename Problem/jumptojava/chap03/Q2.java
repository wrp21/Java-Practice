package Problem.jumptojava.chap03;
// 자연수 13이 홀수인지 짝수인지 판별
public class Q2 {
  public static void main(String[] args) {
    switch (13 % 2) {
      case 0:
        System.out.println("짝수");
        break;
    
      default:
        System.out.println("홀수");
        break;
    }
  }
  
}
