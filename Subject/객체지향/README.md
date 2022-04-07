[Java 정리 목차](https://github.com/wrp21/Java-Practice)

---
## 객체지향 프로그래밍
-------------------------------------------------------------------

### Class
```java
// 클래스
public class Calculator {

  // 멤버변수
  double result = 0;
  String memo = "";
  String name = "";

  // 생성자
  Calculator(String name) {
    this.name = name;
  }

  // 메소드 
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
```

```java
import JumpToJava.OOP.Class.Calculator;

public class ClassExample {
  public static void main(String[] args) {
    // 객체 생성
    // 생성자
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
```
- 클래스의 선언은 설계도를 만든 것이고 `new` 키워드로 생성한 객체는 설계도로 생산된 하나의 제품으로 비유할 수 있다.
- 자바에서 함수는 클래스 내에 있으며, 이를 메소드라고 한다.
- `firstCalculator` 가 객체이며 멤버 변수로 `result`를 가지고 있고, 메소드로 `add`, `sub`, `mul`, `div`, ... 가 있다.
- `firstCalculator`는 `Calculator` 의 인스턴스
- 동일한 클래스의 이름이 다른 인스턴스들의 멤버변수는 `static` 키워드를 사용하지 않으면 독립된 메모리를 할당받는다.
- 멤버변수와 메소드는 `.` 연산자로 접근할 수 있다.
- `this` 키워드는 만들어진 객체를 지칭한다.
    - `firstProblemCalc` 객체의 `setResult` 메소드를 실행하면 클래스에 있는 `this.result`는 `firstProblemCalc.result` 를 의미한다.
- 클래스는 단독 파일로 저장


### 생성자
```java
...

public class Calculator {

  double result = 0;
  String memo = "";
  String name = "";

  // Calculator() {} // default 생성자
  
  // 생성자
  Calculator(String name) {
    this.name = name;
  }

  ...
}

...
```

```java
public class ClassExample {
  public static void main(String[] args) {
    // 객체 생성
    // 생성자
    Calculator firstProblemCalc = new Calculator("First Calculator");
    Calculator secondProblemCalc = new Calculator("Second Calculator");

    ...
  }
}

```

- `new` 키워드로 객체를 생성함과 동시에 값을 할당하고 싶으면 생성자를 이용한다.
- 생성자는 클래스명과 메소드 명이 동일하며, 리턴타입을 정의하지 않는다.
- 생성자가 선언되어 있으며 생성자 규칙대로 객체를 생성하지 않으면 오류 발생
- 생성자를 명시하지 않으면 컴파일러는 입력과 내용이 없는 디폴트 생성자를 자동으로 실행한다.
- 생성자도 매소드처럼 오버로딩이 가능하다 즉 다른 입력을 받아 다른 처리를 하는 여러개의 생성자를 만들 수 있다.

### 메소드 오버로딩(Overloading)
```java
  void setResult(double value) {
    this.result = value;
    this.showState();
  }

  void setResult(Calculator calc) {
    this.result = calc.result;
    this.showState();
  }
```

```java
firstProblemCalc.setResult(0); // 입력  : int
secondProblemCalc.setResult(1);

firstProblemCalc.setResult(secondProblemCalc); // 입력 Calculator
```
- `setResult` 처럼 메소드 이름이 같고 입력이 다른 경우마다 메소드의 정의를 다르게 하는 것을 메소드 오버로딩이라고 한다.
- 객체에서 메소드를 사용하면 입력이 일치하는 메소드로 실행된다.


```java
...

void setResultChange(Calculator calc) {
    double temp = this.result;
    this.result = calc.result;
    calc.result = temp;
    this.showState();
    calc.showState();
  }

...
```

```java
...

firstProblemCalc.setResultChange(secondProblemCalc);

...
```

- 메소드에 기본 자료형(primitive type) 과 객체를 넘겨주는 것은 다르다.
- `setResultChange` 메소드는 Calculator 타입의 인스턴스를 입력 받기 때문에
- `secondProblemCalc` 의 멤버변수의 값이 변경된다.


### 상속

```java
package JumpToJava.OOP.Inheritance;


class Parent {
  String name = "";
  String memo = "";

  Parent(String name) {
    this.name = name;
  }

  void setMemo(String memo) {
    this.memo = String.format("Parent memo: %s\n", this.memo);
  }

  void showMemo() {
    System.out.println(String.format("memo : ", this.memo));
  }

  void showName() {
    System.out.println(String.format("Name : ", this.name));
  }
}

class Child extends Parent {

  Child(String name) {
    super(name);
  }

  void setMemo(String memo) {
    this.memo = String.format("Child memo: %s\n", memo);
  }
}

public class Main {
  public static void main(String[] args) {
    Child child1 = new Child("child1");
    child1.setMemo("child1 memo");

    System.out.println(child1.memo);
    System.out.println(child1.name);

    // 오버라이딩한 setMemo
    child1.setMemo("child1 memo");
    System.out.println(child1.memo);

    // 오버로딩한 setMemo
    child1.setMemo("child1 memo", "+ String ...");
    System.out.println(child1.memo);

  }
}
```
- `extends` 키워드를 사용하여 상속
- 자바는 다중 상속을 지원하지 않음
- `Child` 클래스는 `Parent` 클래스를 상속받으며 이러한 관계를 IS-A 관계라고 한다.
- `Child` 클래스는 상속받은 `Parent` 클래스의 멤버변수와 멤버함수를 사용할 수 있다.
- 부모클래스를 상속받은 상태에서 새로운 메소드를 추가하여 사용할 수 있다.

### 메소드 오버라이딩(Overiding)
```java
class Parent {
  String name = "";
  String memo = "";

  ...

  
  void setMemo(String memo) {
    this.memo = memo;
  }

  ...

}

class Child {
  
  ...

  // 메소드 오버라이딩(Overriding)
  void setMemo(String memo) {
    this.memo = String.format("Child memo: %s\n", memo);
  }

  // 메소드 오버로딩(Overloading)
  void setMemo(String memo, String addString) {
    this.memo = String.format("Child memo : %s %s\n", memo, addString);
  }
}

public class Main {
  public static void main(String[] args) {
    // 객체 생성
    Child child1 = new Child("child1");

    // 오버라이딩한 setMemo
    child1.setMemo("child1 memo");
    System.out.println(child1.memo);

    // 오버로딩한 setMemo
    child1.setMemo("child1 memo", "+ String ...");
    System.out.println(child1.memo);
  }
}
```

- 부모클래스에 있는 메소드를 자식클래스에서 구현하는 것을 메소드 오버라이딩이라고 한다.
- 부모클래스에서 받은 메소드를 오버로딩하는 것 또한 가능하다.


### 인터페이스



```java
interface ChildInterface {
  String getName();
}

class Parent {
  String name = "";
  String memo = "";

  Parent(String name) {
    this.name = name;
  }
}

class ChildOne extends Parent implements ChildInterface {

  String name = "ChildOne";
  ChildOne(String name) {
    super(name);
  }

public String getName() {
  return this.name;
}
}

class ChildTwo extends Parent implements ChildInterface {

  String name = "ChildTwo";

  ChildTwo(String name) {
    super(name);
    
  }

  public String getName() {
    return this.name;
  }
}


class Another {

  void showChildClass(ChildInterface child) {
    System.out.println("클래스 이름 : " + child.getName());
  }
}

public class Main {
  public static void main(String[] args) {
    

    ChildOne classOne = new ChildOne("");
    ChildTwo classTwo = new ChildTwo("");
    
    Another another = new Another();
    another.showChildClass(classOne);
    another.showChildClass(classTwo);

  }
}

```
- 클래스처럼 단독 파일로 저장.
- 객체가 한 개 이상의 자료형 타입을 갖게되는 특성을 다형성(Polymorphism)이라고 한다.
- 인터페이스의 메소드는 인터페이스 안에 이름과 입출력 정의만 있으며, 메소드의 동작은 implements 한 클래스에서 구현
- 인터페이스의 메소드는 항상 public으로 구현
-



#### 디폴트 메소드

```java
```
- 인터페이스 안에서 메서드의 내용을 구현하려면 default 메서드를 사용한다.
- default 메소드를 구현하면, 인터페이스를 implements 하고있는 클래스는 해당 메서드를 구현하지 않아도 사용 가능
- default 메소드는 오버라이딩이 가능하여 클래스에서 내용을 다르게 구현하여 사용할 수 있다.


#### 스태틱 메소드
