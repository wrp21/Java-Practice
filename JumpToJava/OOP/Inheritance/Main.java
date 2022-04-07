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

class Child extends Parent{

  Child(String name) {
    super(name);
  }

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
    Child child1 = new Child("child1");
    child1.setMemo("child1 memo");

    // System.out.println(child1.name);

    // 오버라이딩한 setMemo
    child1.setMemo("child1 memo");
    System.out.println(child1.memo);

    // 오버로딩한 setMemo
    child1.setMemo("child1 memo", "+ String ...");
    System.out.println(child1.memo);

  }
}
