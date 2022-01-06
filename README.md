# Java-Practice
------------------

### 변수 선언
-----------------------------------------------------------------
- 변수 이름은 영문 대소문자, 숫자, 특수문자 중에서 `$`, `_`를 사용할 수 있음.
- 변수 이름은 숫자로 시작할 수 없고, 자바 문법에서 사용되는 예약어들(`public`, `for`, `while`, `break`, etc ...)은 사용할 수 없다.
- camelCase

### 기본 자료형
-----------------------------------------------------------------
- 기본 자료형(primitive data type)은 데이터가 변수에 직접 저장되고
- 객체 자료형은 객체 메모리 주소가 변수에 저장됨
- 기본적으로 정수형 숫자 리터럴은 int, 실수형 숫자 리터럴은 double로 저장
- long을 사용하려면 `1234L`, float을 사용하려면 `1234.1234f`
- 자바에서는 utf-16 인코딩 사용
- 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 됨
- 정밀도가 낮은 자료형에서 높은 자료형으로의 형 변환은 자동으로 됨
- 명시적 형 변환으로 큰 공간의 메모리에서 작은 공간의 메모리로 이동시키면 데이터 누실될 수 있다.

|타임 종류|내용|크기|수의 범위|
|-------|-----|-----|-------|
|byte|정수형|1Byte| -2^7 ~ 2^7 - 1|
|short|정수형|2Byte| -2^15 ~ 2^15 - 1|
|int|정수형|4Byte| -2^31 ~ 2^31 - 1|
|long|정수형|8Byte| -2^63 ~ 2^63 - 1|
|float|실수형|4Byte|1.4E-45 ~ 3.4028235E38|
|double|실수형|8Byte|4.9E-324 ~ 1.7976931348623157E308|
|boolean|논리형|1Byte| true or false|
|char|문자형|2Byte|'\u0000' ~ 'uFFFF' (16비트 유니코드 문자 데이터)|
 
### 기본 자료형의 Wrapper 클래스
---------------------------------------------------------------
- `Integer`, `Long`, `Double`, `Float`, `Boolean`, `Char`
- 기본 자료형은 각각에 대응하는 Wrapper 클래스들이 존재
- ArrayList, HashMap, HashSet 등은 데이터 저장시 Wrapper 클래스를 사용해야한다.
- Wrapper 클래스 사용시 객체를 주고받기 떄문에 코드를 객체 중심적으로 작성하는데 유리함
- 멀티스레딩 환경에서 동기화 지원을 위해 Wrapper 클래스가 필요


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



### 연산자 (Operater)
----------------------------------------------

## 대입 연산자
-----------------------------------------------
- 변수에 값을 할당할 떄 사용하는 연산자
- 연산자 중 우선순위가 가장 낮음
- 변수 = 리터럴, 다른 번수, 식

## 부호 연산자
------------------------------------------------
- +, -
- -1, -2, +3, +5 
- 변수나 리터럴의 부호를 바꿈

## 산술 연산자
-------------------------------------------------
|연산자| 기능         | 예시|
|-----|------------|----|
|+    |덧셈         |1 + 1|
|-    |뺄셈         |1 - 1|
|*    |곱셈         |2 * 2|
|/    |나눗셈(몫)    |4 / 2|
|%    |나눗셈(나머지) |4 % 3|

-------------------------------------------------

## 관계 연산자(비교 연산자)
- 연산의 결과가 true, false로 반환

|연산자| 사용 예     | 반환 값|
|-----|------------|-------|
|>    | 4 > 3      | true  |
|<    | 4 < 3      | false |
|>=   | 4 >= 3     | true  |
|<=   | 4 <= 3     | false |
|==   | 4 == 4     | true  |
|!=   | 4 != 4     | false |

--------------------------------------------------
## 논리 연산자
- `&&`, `||`, `!`
- `&&` : 두 항이 모두 참인 경우에 true를 반환함
- `||` : 두 항 중에서 하나이상 참이면 true를 반환, 모두 거짓이면 false를 반환
- `!` : 논리를 반전시킴(num 값이 true일 때 !num은 false를 반환함)

---------------------------------------------------
## 비트 연산자
- 변수들의 값 또는 리터럴을 비트 단위로 연산함
- 예를 들어, `4 | 3`은 `0100 | 0011` 으로 연산되어 0111(10진법으로 7)이 출력된다.
- `>>>`은 `>>` 처럼 비트이동을 하지만 부호와 상관 없이 0을 채운다

--------------------------------------------------
|연산자  |예                 | 설명                         |
|-------|-------------------|------------------------------|
|~      |~1111 == 000       |num을 의 비트를 1의 보수를 취한다  |
|&      |111 & 110 == 110   |비트 단위의 and 연산을 한다       |
| |     |111 | 000 == 111   |비트 단위의 or 연산을 한다 |
|^      |111 ^ 101 == 010   |비트 단위의 xor 연산을 한다|
|<<     |1111 << 2 == 1100  |왼쪽으로 두번 비트를 이동한다.|
|>>     |1111 >> 2 == 0011  |오른쪽으로 우번 비트를 이동한다.|
|>>>    |num >>> 2          |>> 와 같은 같은 연산, 부호 상관없이 0을 채움|


## 복합 대입 연산자

-------------------------------------------------
|연산자  |사용 예     | 동일한 표현   |
|-------|-----------|-------------|
|+=     |num += 1   |nun = num + 1|
|-=     |num -= 1   |nun = num - 1|
|*=     |num *= 2   |num = num * 2|
|/=     |num /= 2   |num / num = 2|
|<<=    |num <<= 2  |num = num << 2|
|>>=    |num >>= 2  |num = num >> 2|
|>>>=   |num >>>= 2 |num = num >>> 2|
|&=     |num &= mask|num = num & mask|
||=     |num |= mask|num = num ^ mask|
|^=     |num ^= mask|num = num ^ mask|

-------------------------------------------------
## 증감 연산자
-----------------------------------------------------------
- 연산자의 위치에 따라 연산이 되는 순서가 다름
- 전위 연산자
  - `++num`, `--num`
  - `result = ++num` : num 값이 1 증가한 후에 result에 저장됨
- 후위 연산자`
  - `num++`, `num--`
  - `result = ++num` : result에 num이 먼저 저장된 후에 num 값이 1증가

## 삼항 연산자
-----------------------------------------------------------
- `조건식 ? 결과1 : 결과2`
  - 조건식이 true이면 결과1을 실행 false이면 결과2를 실행
  - `num == 10 ? isTen = true : isTen = false`


## 연산자 우선순위
-----------------------------------------------------------
- 1. `()`, `[]`
- 2. `!`, `++`, `--`, `+`, `-`
- 3. `%`, `/`
- 4. `+`, `-`
- 5. `<<`, `<<`
- 6. `<`, `>`, `<=`, `>=`
- 7. `==`, `!=`
- 8. `&`
- 9. `^`
- 10. `|`
- 11. `&&`
- 12. `||`
- 13. `? :`
- 14. `=`, `+=`, `-=`, ` *=`, `%=`, `/=`


### 조건문
-----------------------------------------------------------
## if - else if - else
-----------------------------------------------------------
```java
if(조건식) {
  수행문1
} else if(조건식) {
  수행문2
} else {
  수행문3
}
```
- if 문의 조건식이 true 이면 수행문1을 실행
- 거짓이면 else if의 조건문을 검사하고 참이면 수행문2를 실행
- else if문의 조건문도 거짓이면 else 문의 수행문3를 실행
- else if, else는 없을 수도 있고 if문만 있을 수도 있다.
- if, else if문이 모두 거짓이면 else 문을 실행
- if, else if에서 하나의 조건문이 true가 나오면 나머지 else if, else는 건너뜀

## switch - case
-----------------------------------------------------------
```java
switch(변수) {
  case 값1: 수행문1;
    break;
  case 값2: 수행문2;
    break;
  case 값3: 수행문3;
    break;
  case 4: case 5: case 6: case 7: 수행문4
    break;
  default: 수행문5; 
    break;
}
```

- 변수의 값에 따라 다른 수행문을 실행시킴
- 변수의 값이 값1 이면 수행문1을 실행하고 break 문이 나오면 switch문을 종료함
- break 문이 없으면 그 다움 case문이 실행된다.
- 변수의 값이 case 문의 값과 일치하는 것이 없으면 default 문을 실행
- 변수의 값에는 문자열도 올 수 있다.
- Java 14에서 부터는 switch에서 yeild 키워드로 값을 출력할 수 있고 이를 변수에 할당할 수 있다.

```java
  int value = 1;
  int variable = 123;
  variable = switch(value) {
    case 1, 2, 3, 4, 5, 6, 7 -> {
      yield 1;
    }

    case 8, 9, 10, 11, 12, 13, 14 -> {
      yield 2;
    }

    default -> {
      yield 0;
    }
    
  };
```


### 반복문 
------------------------------------------

## while

```java
while(조건문) {
  수행문
}
```
- 조건문이 true 이면 수행문을 실행하고 다시 조건문을 검사하고 수행문을 실행하고...
- 조건문이 false 가 나올때까지 계속 반복

```java
while(조건문) {
  
  수행문1;
  수행문2;

  if(condition1 == true) {
    continue;
  }

  if(condition2 == true) {
    break;
  }
  수행문 4;
}
```
- `break` 문을 실행하면 while 문을 빠져나온다
- `continue` 문을 실행하면 나머지 조건문을 실행하지 않고 다시 조건문을 검사한다.
- `break`, `continue`는 `do - while`, `for`문 에서도 사용할 수 있다.

## do - while 
-----------------------------------------------------------
```java
do {
  수행문
} while(조건문)
```
- while문 과의 차이점으로 최초로 검사하기 전에 무조건 한번 수행문을 실행한다.


## for
------------------------------------------------------------
```java
for (초기화식; 조건식; 증감식) {
  수행문;
}
```
- 실행 순서: 초기화식 -> 조건식 -> 수행문 -> 증감식 -> 조건식
- 초기화식은 한번만 실행됨.
- 조건식 -> 수행문 -> 증감식 형태가 조건식이 false 일 때까지 계속 반복됨
- 초기화식이 바깥에 있거나, 조건식이 내부에 있거나, 증감식이 필요 없을 경우 각각 생략 가능
- 모두 생략하면 `for(;;)` 처럼 되며 내부의 수행문을 무한반복하게 됨.

## foreach
--------------------------------------------------------------
```java
for (type var: iterate) {
  body-of-loop
}
```
- iterate 부분에 들어갈 수 있는 타입은 Array, Collections, iterable<E>를 상속받은 객체
- javascript 의 `for - of`, 파이썬의 `for - in` 과 유사

```java
String[] arrayNumber = {"one", "two", "three"};
for (String var : arrayNumber) {
  system.out.println(var);
}
```
출력
`
one
two
three
`


