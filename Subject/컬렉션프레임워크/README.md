[Java 정리 목차](https://github.com/wrp21/Java-Practice)

---
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
