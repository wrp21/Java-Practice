package javaBasicSyntax.OOP.Class;

public class Calculator {
  // static 
  double result = 0;

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
}