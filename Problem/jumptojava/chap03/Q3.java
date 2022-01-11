package Problem.jumptojava.chap03;

public class Q3 {
  public static void main(String[] args) {
    String info = "881120-1068234";
    // System.out.println();
    
    System.out.println(String.format("연월일(YYYYMMDD) : 19%s", info.substring(0, 6)));
    System.out.println(String.format("뒤의 숫자 부분 : %s", info.substring(7)));
  }
}
