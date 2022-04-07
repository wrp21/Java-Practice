package JumpToJava;

public class IfSwitch {
  public static void main(String[] args) {
    int score = 50;
    char grade = 'F';

    if (score >= 90) {
      grade = 'A';
    }
    else if (score >= 80) {
      grade = 'B';
    }
    else if (score >= 70) {
      grade = 'C';
    }
    else if (score >= 60) {
      grade = 'D';
    }
    else if (score >= 50) {
      grade = 'E';
    }
    else {
      grade = 'F';
    }

    System.out.println(grade);

    int month = 3;
    String message = "";
    switch (month) {
      case 1: message = "1"; break;
      case 2: message = "2"; break;
      case 3: message = "3"; break;
      case 4: case 5: case 6: message = "456"; break;
      case 7, 8, 9, 10, 11, 12: message = "789101112"; break;
      default: message = "none"; break;
    }

    System.out.println(message);


    message = switch (month) {
      case 1, 3, 5, 7, 9, 11 -> {
        System.out.println("홀수");
        yield "홀수";
      }
      case 2, 4, 6, 8, 10, 12 -> {
        System.out.println("짝수");
        yield "짝수";
      } 
      default -> {
        yield "none";
      }
        
    };

    System.out.println(message);

    switch (message) {
      case "짝수":
        System.out.println("message : " + message);
        break;
      case "홀수":
        System.out.println("message : " + message);
        break;
      default:
        System.out.println("none");
        break;
    }

    
  }
}