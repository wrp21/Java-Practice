[Java 정리 목차](https://github.com/wrp21/Java-Practice)

---
### 입출력
--------------------------------------------------------

#### 콘솔 입출력

- 콘솔은 사용자의 입력을 받거나 사용자에게 문자열을 출력해주는 역활을하는 것을 통칭
-
- 콘솔 입력 : 사용자에게 입력을 받음
    - `InputStream`, `InputStreamReader`, `BufferedReader`, `Scanner` 클래스 사용
    - `System.in`은 `InputStream` 객체
- 콘솔 출력 : 사용자에게 보여줌
    - `PrintStream` 클래스 사용
    - `System.out`은 `PrintStream` 객체
- `throws IOException`

#### 콘솔 입력

##### InputStream

```java
package JumpToJava;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Scanner;
import java.io.IOException;

public class IoExam {
  public static void main(String[] args) throws IOException {
    InputStream input = System.in;
    input.read(); // a 입력
    System.out.println(input);
    // 97 출력
  }
}
```
- `System` 클래스는 `java.lang` 에 속해 있어서 import 해주지 않아도 됨
- `java.io.InputStream`
- `InputStream`의 `read` 메소드는 1byte만 읽을 수 있으며 `int` 타입으로 저장됨, 값은 0~255 사이의 ascii 값

##### InputStreamReader

```java
package JumpToJava;

import java.io.IOException;
import java.io.InputStreamReader;

public class IoExam {
  public static void main(String[] args) throws IOException {
    InputStreamReader input = new InputStreamReader(System.in);
    char[] chItems = new char[3];
    input.read(chItems); // aaa 입력
    System.out.println(chItems); // aaa 출력
  }
}
```

- `java.io.InputStreamReader`
- `InputStreamReader`의 `read` 메소드는 `char` 타입으로 저장되어 입력한 문자 그대로 출력할 수 있다.
- `InputStream` 과 마찬가지로 1byte 만 입력받을 수 있기 때문에 여러 문자를 입력받으려면 고정된 길이의 배열을 사용해야한다.

###### BufferedReader

```java
package JumpToJava;

import java.io.IOExcepion;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoExam {
  public static void main(String[] args) throws IOException {
    InputStream isInput = System.in;
    InputSteamReader isrInput = new InputStreamReader(isInput);
    BufferedReader brInput = new BufferedReader(isrInput);

    String line = brInput.readLine();
    System.out.println(line);

  }
}
```
- `java.io.BufferedReader`
- `readLine` 메소드를 이용하여 `InputStream`, `InputStreamReader`와 다르게 `Enter` 입력 전까지의 문자열(String)를 받을 수 있다.
    - `InputStream` : byte
    - `InputStreamReader` : character
    - `BufferedReader` : String

##### Scanner

```java
package JumpToJava;

import java.util.Scanner;

public class IoExam {
  public static void main(String[] args) {
    Scanner inputWord = new Scanner(System.in);
    Scanner inputLine = new Scanner(System.in);
    Scanner inputInteger = new Scanner(System.in);

    System.out.println(inputWord.next());
    System.out.println(inputLine.nextLine());
    System.out.println(inputInteger.nextInt());
  }
}
```

- `java.util.Scanner`
- `Scanner` 클래스는 생성자의 입력으로 콘솔입력인 `InputStream` 클래스인 `System.in` 을 넣어야한다.
- `next` 메소드 : 단어 하나(Token)을 읽음
- `nextLine` : 라인
- `nextInt` : 정수

#### 콘솔 출력

- `System.out`은 `PrintStream` 클래스의 객체이며 콘솔에 값을 출력할 때 사용
- `println`, `print`, `printf`
- `System.err` 는 오류 메세지를 출력할 경우에 사용


#### 파일 입출력

##### FileOutputStream

```java
package JumpToJava;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    FileOutputStream output = new FileOutputStream("JumpToJava/output.txt");
    for (int i = 0; i < 11; i++) {
      String lineString = i + " line \r\n";
      output.write(lineString.getBytes());
    }
    output.close();
  }
}
```
- `java.io.FileOutputStream`, `java.io.IOException`
- `FileOutputStream` 클래스는 `OutputStream` 을 상속 받는 클래스
    - `InputStream` 처럼 데이터를 바이트 단위로 처리해야함
    - `String` 을 바이트의 배열로 만들어 주기 위해 `getBytes` 메소드 사용
- `FileOutputStream` 객체의 생성자의 입력으로 파일 경로, 이름 전달
- `write` 메소드로 파일 쓰기
- 윈도우 : `\r\n`, 유닉스 : `\n` 를 붙여야 다음 라인에 쓸 수 있음
- `close` 메소드로 파일객체를 닫을 수 있지만, 없어도 프로그램이 종료되면 자동으로 닫아준다.

##### FileWriter

```java
package JumpToJava;

import java.io.FileWriter;
import java.io.IOException;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    FileWriter output = new FileWriter("JumpToJava/output.txt");
    for (int i = 0; i < 11; i++) {
      String lineString = i + "line(FileWriter) \r\n";
      output.write(lineString);
    }
    output.close();
  }
}
```

- `java.io.FileWriter`
- `FileOutputStream`과 달리 문자열 타입을 바로 인자로 줄 수 있다.
- 여전히 `\r\n` 필요

##### PrintWriter

```java
package JumpToJava;

import java.io.PrintWriter;
import java.io.IOException;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    PrintWriter output = new PrintWriter('output.txt');
    for (int i = 0; i < 11; i++) {
      String lineString = i + " line(PrintWriter)";
      output.println(lineString);
    }
    output.close();
  }
}
```
- `java.io.PrintWriter`
- `\r\n` 불필요
- `println` 메소드

#### 파일 내용 추가하기

```java
package JumpToJava;

import java.io.IOException;
import java.io.FileWriter;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    FileWriter output = new FileWriter("JumpToJava/output.txt", true);
    for (int i = 11; i < 23; i++) {
      String addLine = i + " line(FileWriter), add \r\n";
      output.write(addLine);
    }
    output.close();
  }
}
```

- `FileWriter` 객체의 생성자의 두번째 인자로 `true`를 전달하면 추가모드로 열고 덮어쓰지 않고 추가로 내용이 생성됨

```java
package JumpToJava;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    PrintWriter output = new PrintWriter(new FileWriter("JumpToJava/output.txt", true));
    for (int i = 23; i < 33; i++) {
      String addLine = i + "line(PrintWriter(FileWriter)), add";
      output.println(addLine);
    }
    output.close();

  }
}
```
- `PrintWriter` 객체를 생성할때 인자로 `FileWriter` 객체 추가모드로 전달
- `println`

#### 파일 읽기

- `FileInputStream`의 `read` 매소드
- `BufferedReader` 객체 생성자에 `FileReader` 객체 전달

```java
package JumpToJava;

import java.io.FileInputStream;
import java.io.IOException;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    byte[] bArray = new byte[2048];
    FileInputStream fInput = new FileInputStream("JumpToJava/output.txt");
    fInput.read(bArray);
    System.out.println(new String(bArray));
    fInput.close();
  }
}
```

- `FileInputStream`을 사용하는 방법은 파일의 길이를 알고 있어야 한다.

```java
package JumpToJava;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    BufferedReader bfInput = new BufferedReader(new FileReader("JumpToJava/output.txt"));
    while (true) {
      String line = bfInput.readLine();
      if (line == null) break;
      System.out.println(line);
    }
    bfInput.close();
  }
}
```
- `BufferedReader` 객체의 생성자에 `FileReader` 객체 전달
- `BufferedReader` 의 `readLine` 메소드는 읽을 라인이 없으면 null을 반환
- 파일의 길이를 몰라도 된다.