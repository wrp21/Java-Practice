package JumpToJava.OOP.Interface;

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
