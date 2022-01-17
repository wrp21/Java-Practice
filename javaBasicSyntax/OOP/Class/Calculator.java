package javaBasicSyntax.OOP.Class;

public class Calculator {
  // static 
  double result = 0;
  String memo = "";
  String name = "";

  // 생성자
  Calculator(String name) {
    this.name = name;
  }

  double add(double addNumber) {
    result += addNumber;
    return result;
  }

  double sub(double subNumber) {
    result -= subNumber;
    return result;
  }

  double mul(double mulNumber) {
    result *= mulNumber;
    return result;
  }

  double div(double divNumber) {
    result /= divNumber;
    return result;
  }

  void setMemo(String value) {
    this.memo = value;
  }

  void showState() {
    System.out.println(String.format("memo: %s", this.memo));
    System.out.println(String.format("result: %s\n", this.result));
  }

  void setResult(double value) {
    this.result = value;
    this.showState();
  }

  void setResult(Calculator calc) {
    this.result = calc.result;
    this.showState();
  }

  void setResultChange(Calculator calc) {
    double temp = this.result;
    this.result = calc.result;
    calc.result = temp;
    this.showState();
    calc.showState();
  }
}