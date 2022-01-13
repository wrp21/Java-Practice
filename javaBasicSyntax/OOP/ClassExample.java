package javaBasicSyntax.OOP;

import javaBasicSyntax.OOP.Calculator;


public class ClassExample {
  public static void main(String[] args) {
    

    Calculator firstProblemCalc = new Calculator();
    Calculator secondProblemCalc = new Calculator();

    
    // 첫번째 문제를 풀기 위한 계산기
    firstProblemCalc.add(5);
    firstProblemCalc.add(5);
    firstProblemCalc.sub(2);
    firstProblemCalc.mul(2);
    firstProblemCalc.div(8);
    System.out.println(firstProblemCalc.result);

    // 두번째 문제를 풀기 위한 계산기
    secondProblemCalc.add(20);
    secondProblemCalc.div(2);
    secondProblemCalc.sub(8);
    secondProblemCalc.mul(2);
    System.out.println(secondProblemCalc.result);

    

  }
}
