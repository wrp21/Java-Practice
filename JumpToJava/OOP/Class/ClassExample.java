package JumpToJava.OOP.Class;


public class ClassExample {
  public static void main(String[] args) {
    
    Calculator firstProblemCalc = new Calculator("First Calculator");
    Calculator secondProblemCalc = new Calculator("Second Calculator");

    System.out.println(String.format("name : %s", firstProblemCalc.name));
    System.out.println(String.format("name : %s", secondProblemCalc.name));


    // 첫번째 문제를 풀기 위한 계산기
    firstProblemCalc.setMemo("Problem 1");
    firstProblemCalc.add(5);
    firstProblemCalc.add(5);
    firstProblemCalc.sub(2);
    firstProblemCalc.mul(2);
    firstProblemCalc.div(8);
    firstProblemCalc.showState();

    // 두번째 문제를 풀기 위한 계산기
    secondProblemCalc.setMemo("Problem 2");
    secondProblemCalc.add(20);
    secondProblemCalc.div(2);
    secondProblemCalc.sub(8);
    secondProblemCalc.mul(2);
    secondProblemCalc.showState();
    
    firstProblemCalc.setResultChange(secondProblemCalc);

    firstProblemCalc.setResult(0);
    secondProblemCalc.setResult(1);

    firstProblemCalc.setResult(secondProblemCalc);

    

  }
}
