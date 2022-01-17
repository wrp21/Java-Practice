# Java-Practice
------------------


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
| `|`   |`111 | 000 == 111` |비트 단위의 or 연산을 한다 |
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
|`|=`   |`num |= mask`|num = num ^ mask|
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

### 배열
---------------------------------------------------
```java
int[] numbers = {1, 2, 3, 4, 5};
String[] strings = {"one", "two", "three", "four"};
String[] strings2 = new String[7];

// 자료형[] 변수명 = {...};
```
- 배열의 길이는 고정
- 배열의 길이는 `numbers[0]` 와 같이 인덱싱으로 접근할 수 있다.
- `strings.length`를 이용하여 배열의 길이 출력
- 접근시 인덱스의 범위를 벗어나면 `ArrayIndexOutOfBoundsException` 에러 발생



### ArrayList
---------------------------------------------------

- List 자료형 중에서는 ArrayList, Vector, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다
- List 자료형은 인터페이스
- List는 배열과 다르게 크기가 고정이 아니라 동적으로 변할 수 있다.
- `java.util.ArrayList`를 Import 해야한다.

```java
import java.util.ArrayList;

ArrayList<String> alItems1 = new ArrayList<String>(); // 1
ArrayList<String> alItems2 = new ArrayList<>();       // 2
ArrayList alItems3 = new ArrayList();                 // 3

alItems3.add("first");
alItems3.add("second");
alItems3.add(true);
alItems3.add(123);

// String Item0 = alItems3.get(0); // error
String Item0 = (String)alItems3.get(0);
String Item1 = (String)alitems3.get(1);
System.out.println(item0);
System.out.println(item1);
```
- `1`과 `2`는 같은 표현 : Generics를 사용하여 `alItems1, 2` 안에 담을 수 있는 타입은 `String` 타입의 데이터임을 의미
- `3` 처럼 Generics를 이용한 데이터 타입을 명시하지 않으면, 내부에는 Object 타입의 객체가 들어가며, 이는 모든 객체가 상속하고 있는 가장 기본적인 타입이므로 `String`, `int`, `boolean` 등 어떤 타입의 데이터도 들어갈 수 있다.
- 데이터를 꺼내서 다른 변수에 넣을 경우 타입 캐스팅을 해주어야한다.

#### java.util.Arrays 클래스의 asList 메소드

```java
import java.util.Arrays;

String[] data = {"1", "2", "3"};
ArrayList<String> alData4 = new ArrayList<>(Arrays.asList(data));
ArrayList<String> alData4 = new ArrayList<>(Arrays.asList({"1", "2", "3"}));
ArrayList<String> alData4 = new ArrayList<>(Arrays.asList("1", "2", "3"));
```
- `java.util.Arrays` 클래스의 `asList` 메소드 : 존재하는 문자열로 ArrayList 생성 가능

#### ArrayList 메소드

```java
alItems1.add("0");
alItems1.add("1");
alItems1.add("2");
alItems1.add("3");
System.out.println(alItems1.size());
System.out.println(alItems1.contains("1"));
alItems1.get(1);
alItems1.remove(3);
alItems1.remove("2");
```
- `add` : 리스트에 데이터를 추가
- `size`: 리스트의 크기 반환
- `contains(value)` : 리스트에 value 값의 존재 여부 boolean으로 반환
- `get(index)` : 리스트에서 index에 해당하는 값을 반환
- `remove(index or value)`
    - index 인 경우 : 인덱스에 해당하는 값을 삭제하고, 삭제한 값을 반환한다.
    - value 인 경우 : 리스트에서 value 인 값을 삭제하고 결과를 boolean으로 반환한다.

#### String.join

```java
ArrayList<String> alData4 = new ArrayList<>(Arrays.asList("1","2","3"));
String result1 = String.join(",", alData4);
System.out.println(result1);
// 1,2,3

String[] testStrings = new String[]{"1", "2", "3"};
String testString = String.join(",", testStrings);
System.out.println(testString); 
// 1,2,3
```
- `String.join("구분자", 리스트) :  리스트의 요소들 사이에 구분자를 넣어 문자열을 만들어 반환함.
    - 리스트가 {"1", "2", "3"} 이면 String.join의 반환 값은 "1,2,3"

#### 리스트 정렬

```java
import java.util.Comparator;

ArrayList<String> alData5 = new ArrayList<>(Arrays.asList("2", "1", "3", "5", "4"));
alData5.sort(Comparator.naturalOrder());
System.out.println(alData5);
// [1, 2, 3, 4, 5]

alData5.sort(Comparator.reverseOrder());
System.out.println(alData5);
// [5, 4, 3, 2, 1]
```
- Java 8 부터 리스트에서 sort 메소드를 사용할 수 있다.
- `java.util.Comparator`
    - Comparator.naturalOrder() : 오름차순 정렬
    - Comparator.reverseOrder() : 내림차순 정렬

### Map
------------------------------------------------------
```java
import java.util.HashMap;

HashMap<String, String> map = new HashMap<>();

```
- 자바의 Map은 파이썬의 딕셔너리와 비슷
- Key - Value를 한 쌍으로 갖는 자료형
- 배열과 리스트틑 값을 찾기 위해 순차적으로 검색하지만
- Map은 순서에 의존하지 않고 Key를 통해 Value를 얻는다.
- 순서가 없기 때문에 인덱싱을 지원하지 않음
- Map은 인터페이스이며 Map 인터페이스를 구현한 Map 자료형에는
- HashMap, LinkedHashMap, TreeMap 등이 존재

```java
// put 메소드 : Key - Value를 해쉬맵에 저장 
    map.put("people", "사람");
    map.put("baseball", "야구");

    // get 메소드 : key에 해당하는 value 값을 불러옴
    System.out.println(map.get("people"));
    System.out.println(map.get("baseball"));

    // getOrDefault 메소드 : key에 해당하는 값이 없으면(null 이면)
    // 디폴트 값을 반환시킬 수 있음.
    System.out.println(map.getOrDefault("java", "자바"));
    System.out.println(map.getOrDefault("people", "자바"));

    // containskey 메소드 : 맵에 해당 key의 유무를 boolean으로 출력
    System.out.println(map.containsKey("people"));
    System.out.println(map.containsKey("java"));

    // remove 메소드 : Key 에 해당하는 item(key, value)를 삭제하고 value를 반환
    // key 가 없으면 null을 반환
    System.out.println(map.remove("people")); // "사람" 출력
    System.out.println(map.remove("java"));   // null 출력

    // size 메소드 : Map의 길이(요소의 개수) 반환
    System.out.println(map.size());

    // keySet 메소드 : Map에 있는 모든 key를 Set 타입으로 반환
    map.put("people", "사람");

    HashMap<String, String> map2 = new HashMap<>();
    map2.put("people", "사람");
    map2.put("baseball", "야구");
    System.out.println(map.keySet());
```
- 메소드 : `put`, `get`, `getOrDefault`. `size`, `containskey`, `remove`, `keySet`
- LinkedHashMap : 입력된 순서대로 데이터를 저장
- TreeMap : 입력된 Key의 오름차순 순서로 데이터를 저장

### Set
----------------------------------------------
```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>(Arrays.asList("H","e", "l", "l","o"));
System.out.println(set);
// add 메소드 : 값 한개 추가
set.add("123");
set.add("456");
System.out.println(set);

// addAll 메소드 : 값 여러개 추가
set.addAll(Arrays.asList("111", "222", "333"));
System.out.println(set);

// remove 메소드 : 값 제거
set.remove("111");
System.out.println(set);
    
HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
    
// set1, set2의 교집합
HashSet<Integer> set3 = new HashSet<>(set1);
set3.retainAll(set2); // set1 의 데이터를 유지하기 위해 set3를 만들어서 사용
System.out.println(set3);

// set1, set2의 합집합
HashSet<Integer> set4 = new HashSet<>(set1);
set4.addAll(set2);
System.out.println(set4);

// set1, set2의 차집합
HashSet<Integer> set5 = new HashSet<>(set1);
set5.removeAll(set2);
System.out.println(set5);

```
- `java.util.HashSet`
- 요소의 중복을 허용하지 않음
- map과 마찬가지로 순서가 없고 인덱싱을 지원하지 않음
- Set 자료형은 인터페이스
- 메소드 : `add`, `addAll`, `remove`, `removeAll`, `retainAll`
- HashSet, TreeSet, LinkedHashSet
    - TreeSet : 오름차순으로 값을 정렬하여 저장
    - LinkedHashSet : 입력한 순서대로 값을 정렬하여 저장

### Enum
---------------------------------------------------------
```java
public class temp {
  enum Seasons {
    SPRING,
    SUMMER,
    FALL,
    WINTER
  };
  
  public static void main(String[] args) {
    for (Seasons season: Seasons.values() ) {
      System.out.println(season);
    }
  }
}

```
- 상수 집합을 정의할 경우에 사용
- `1`, `2`... 같은 매직 넘버를 사용하는 것보다 알아보기 쉽다.
- 타입으로서 역활을 하기 때문에 enum 타입을 만들고 지정해놓으면 엉뚱한 값을 넣을때 컴파일러에 의해 알아차릴 수 있다.


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
package javaBasicSyntax;
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
package javaBasicSyntax;
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
package javaBasicSyntax;
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
package javaBasicSyntax;
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
package javaBasicSyntax;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    FileOutputStream output = new FileOutputStream("output.txt");
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
package javaBasicSyntax;
import java.io.FileWriter;
import java.io.IOException;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    FileWriter output = new FileWriter("output.txt");
    for(int i = 0; i < 11; i++) {
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
package javaBasicSyntax;
import java.io.PrintWriter;
import java.io.IOException;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    PrintWriter output = new PrintWriter('output.txt');
    for(int i = 0; i < 11; i++) {
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
package javaBasicSyntax;
import java.io.IOException;
import java.io.FileWriter;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    FileWriter output = new FileWriter("output.txt", true);
    for(int i = 11; i < 23; i++) {
      String addLine = i + " line(FileWriter), add \r\n";
      output.write(addLine);
    }
    output.close();
  }
}
```

- `FileWriter` 객체의 생성자의 두번째 인자로 `true`를 전달하면 추가모드로 열고 덮어쓰지 않고 추가로 내용이 생성됨


```java
package javaBasicSyntax;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class FileIoExam {
  public static void main(String[] args) throws IOException {
    PrintWriter output = new PrintWriter(new FileWriter("output.txt", true));
    for (int i = 23; i < 33; i++ ) {
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
package javaBasicSyntax;
import java.io.FileInputStream;
import java.io.IOException;

public class FileIoExam {
  public static void main(String[] args) throws IOException{
    byte[] bArray = new byte[2048];
    FileInputStream fInput = new FileInputStream("output.txt");
    fInput.read(bArray);
    System.out.println(new String(bArray));
    fInput.close();
  }
}
```

- `FileInputStream`을 사용하는 방법은 파일의 길이를 알고 있어야 한다.

```java
package javaBasicSyntax;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileIoExam {
  public static void main(String[] args) throws IOException{
    BufferedReader bfInput = new BufferedReader(new FileReader("output.txt"));
    while(true) {
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
import javaBasicSyntax.OOP.Class.Calculator;

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
package javaBasicSyntax.OOP.Inheritance;


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

