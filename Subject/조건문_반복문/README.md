
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
