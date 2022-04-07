[Java 정리 목차](https://github.com/wrp21/Java-Practice)

---
### 문자열(String)
-----------------------------------------------
```java
String textHello = "Hello";
String textJava = new String(" Java");
String textHelloJava = textHello + textJava;
```
- 문자열 자료형(String)은 기본자료형이 아니라 객체임.
- 객체 생성하여 할당하는 방식과 리터럴 형식으로 값을 할당하는 것에는 차이가 있음
    - 리터럴 방식은 객체 생성없이 intern pool에 저장하고, 동일한 값 할당시 cache된 값을 할당
    - new String(" Java") 는 항상 새로운 객체를 만든다.

### 문자열 내장 메소드
----------------------------------------------------------------------------
#### equals

```java
String text1 = "text";
String text2 = "text";
String text3 = new String("text");
String text4 = "text4";
System.out.println(text1.equals(text2)); // true
System.out.println(text1.equals(text3)); // true
System.out.println(text1 == text3);      // false
System.out.println(text1 == text4);      // false
```
- equals 메소드는 두 문자열의 값 일치 여부를 출력한다.
- `==` 연산은 두 개의 데이터 타입이 같은지를 판별하기 때문에 위의 경우 false를 출력함

#### indexOf
```java
String message = "I like Java";
System.out.println(message.indexOf("like"));  // 2
System.out.println(message.indexOf("w"));     // -1
```
- indexOf 메소드는 문자열의 시작위치의 인덱스를 반환한다.
- 없는 문자열을 가리키면 -1 을 반환한다.


#### contains
```java
String msgHello = "Hello World";
System.out.println(msgHello.contains("Hello"));
System.out.println(msgHello.contains("hello"));
System.out.println(msgHello.contains("Hll"));
```
- 지정한 문자열의 존재 여부 출력(boolean)
- 대소문자 구별


#### charAt
```java
String msgHello = "Hello World";
System.out.println(msgHello.charAt(0)); // H 출력
System.out.println(msgHello.charAt(6)); // W 출력
System.out.println(msgHello.charAt(11)); // java.lang.StringIndexOutOfBoundsException: String index out of range
```
- 문자열의 변수의 지정한 인덱스의 내용(문자, char) 출력
- 인덱스 범위를 벗어나면 에러 출력


#### replaceAll
```java
String msgHello = "Hello World";
System.out.println(msgHello.replaceAll("World", "World1"));
// Hello World1
```
- 특정 문자열을 다른 문자열로 바꾼 값을 반환한다.

#### substring
```java
String msgHello = "Hello World";
System.out.println(msgHello.substring(0)); // Hello World
System.out.println(msgHello.substring(6)); // World
System.out.println(msgHello.substring(0, 4)); // Hell
```
- 지정한 인덱스를 시작으로 문자열을 출력함
- `substring(시작위치)` : 시작위치 인덱스부터 끝까지 반환
- `substring(시작, 끝)` : 시작 인덱스부터 끝 - 1 까지 반환

#### toUpperCase, toLowerCase
```java
String msgHello = "Hello World";
System.out.println(msgHello.toUpperCase()); // HELLO WORLD
System.out.println(msgHello.toLowerCase()); // hello world
```
- toUpperCase : 문자열을 대문자로 변환하여 반환
- toLowerCase : 문자열을 소문자로 변환하여 반환

#### split
```java
String msgNotSplit = "2022-01-01";
String[] msgSplit = msgNotSplit.split("-");
  for(String element: msgSplit) {
    System.out.println(element);
  }
// 2022
// 01
// 01
```

- 특정 문자를 기준으로 문자열을 분리함
- String[] 타입으로 반환

#### String.format()
```java
int number1 = 10;
int number2 = 20;
String stringMsg1 = String.format("number1 + number2 = %d\n", number1 + number2);
String stringMsg2 = String.format("%%");
System.out.println(stringMsg1);
System.out.println(stringMsg2);

```

- `String.format()` : `printf` 처럼 서식문자를 이용하여 문자열 포매팅이 가능하며, 문자열 변수에 할당할 수 있음
- `%d`, `%f`, `%c`, `%s`, `%o`, `%x`, `%%` ...
- `System.out.printf`

```java
String stringHello = String.format("%10s", "Hello");
System.out.println(stringHello);
//     Hello

String stringHelloWorld = String.format("%-10s %s", "Hello", "World");
System.out.println(stringHelloWorld);
// Hello      World
```
- 길이 10의 문자열을 오른쪽 정렬 후 나머지를 공백으로 채움
- `%-10s`는 왼쪽 정렬


### StringBuffer
----------------------------------------------
```java
StringBuffer sbHelloWorld = new StringBuffer();
System.out.println(sbHelloWorld);
sbHelloWorld.append("hello");
sbHelloWorld.append(" ");
sbHelloWorld.append("World");
System.out.println(sbHelloWorld);

String sHelloWorld = sbHelloWorld.toString();
System.out.println(sHelloWorld);
// hello world
sbHelloWorld.insert(0, "java");
// javahello world

```
- String 처럼 문자열 자료형이지만, mutable 하다.
- `append`, `insert`, `substring`, `toString`
- `substring`, `toString`은 String의 메소드와 사용법이 동일
- `append` 는 문자열을 추가함
- `insert`는 지정한 인덱스에서 부터 문자열을 추가함

```java
String sMsg = "";
sMsg += "hello";
sMsg += " ";
sMsg += "world";
System.out.println(sMsg);
```
- String 객체는 Immutable 하다.
- `StringBuffer`와 달리 `String` 변수 `sMsg` 는 + 연산마다 문자열을 추가하는 것이 아니라 새로운 String 객체를 생성
- `toUpperCase` 같은 String 메소드들은 문자열이 변경되는 것이 아니라 새로운 String 객체를 생성하여 리턴함
- `StringBuffer` 객체가 `String` 객체보다 메모리 사용량이 많고 속도도 느리므로, 문자열 추가, 변경 작업이 많은경우가 아닌 이상 `String` 객체 사용하는 것이 유리


### StringBuilder
---------------------------------------------------
- `StringBuffer`와 사용법은 동일하나 성능이 우수하다.
- 멀티 스레드 환경에서는 `StringBuffer` 가 안전하다.
- 동기화가 필요 없는 상황에서는 `StringBuffer` 보다 `StringBuilder`가 유리.
