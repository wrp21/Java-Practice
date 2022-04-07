
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
