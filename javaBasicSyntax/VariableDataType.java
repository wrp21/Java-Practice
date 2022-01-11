
package javaBasicSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;




public class VariableDataType {
  // 메인 메소드 바깥에 있어야함

  enum Seasons {
    SPRING,
    SUMMER,
    FALL,
    WINTER
  };
  public static void main (String[] args) {
    
    // 변수 이름은 영문 대소문자, 숫자, 특수문자 중 $, _ 를 사용할 수 있다
    // 변수 이름의 시작은 숫자로 할 수 없다
    // 예약어 사용 불가능(public, while, for, break, package, ...)
    // 변수 명명방법은 camelCase

    int camelCaseVariable = 10;
    int $_variable = 10;
    int variable123 = 123;
    int while123 = 123;
    int _while = 123;
    

    // 에러 발생
    // int #variable = 10;
    // int %variable = 10;
    // int while = 10;
    // int for = 10;
    // int 123Variable = 10;
    
    System.out.println(camelCaseVariable);
    System.out.println($_variable);
    System.out.println(while123);
    System.out.println(variable123);
    System.out.println(_while);

    // 데이터 타입
    // 기본 자료형(primitive data type)은 데이터가 변수에 직접 저장되고
    // 객체 자료형은 객체 메모리 주소가 변수에 저장된다 (reference)

    // 정수형 데이터 타입
    byte byteNumber = 10;   // 크기 1바이트
    short shortNumber = 10; // 크기 2바이트
    int intNumber = 10;     // 크기 4바이트, 기본적으로 숫자 리터럴은 int로 저장됨
    long longNumber = 10L;   // 크기 8바이트, long 타입의 리터럴을 표시해줘야함 

    System.out.println(byteNumber);
    System.out.println(shortNumber);
    System.out.println(intNumber);
    System.out.println(longNumber);

    System.out.println();

    // 실수형 데이터 타입
    float floatNum = 1234.1234F;
    double doubleNum = 1234.1234;
    
    System.out.println(floatNum);
    System.out.println(doubleNum);

    // 문자형 데이터 타입
    char chNumberA = 65; // utf-16 A
    char chNumberB = 66;
    char chChar   = 'A';
    char chSix = '6';

    System.out.println(chNumberA);
    System.out.println(chNumberB);
    System.out.println(chChar);
    System.out.println(chSix);

    // 논리형 데이터 타입
    boolean isTrue = true;
    boolean isFalse = false;

    System.out.println(isTrue);
    System.out.println(isFalse);

    // java 10에서 부터 지역변수이면 타입 추론이 가능하다
    var i = 10; // 정수형으로 추론
    var j = 10.0; // 
    var str = "hello";

    System.out.println(i);
    System.out.println(j);
    System.out.println(str);

    // final 명령어로 상수를 선언할 수 있음
    final int MAX_NUM = 100;
    final int MIN_NUM;
    MIN_NUM = 0;
    
    System.out.println(MAX_NUM);
    System.out.println(MIN_NUM);

    byte byteNum = 123;
    int intNum = byteNum;
    float fltNum = intNum;
    
    byteNum = (byte)fltNum;
    intNum = (int)byteNum;

    double dNum = 1.2;
    float fNum = 0.9F;
    
    int iNum1 = (int)dNum + (int)fNum;
    int iNum2 = (int)(dNum + fNum);
    // int iNum3 = (int)dNum + fNum; // type error
    System.out.println(iNum1);
    System.out.println(iNum2);
    // System.out.println(iNum3);


    System.out.println();

    byte num1 = 5;   // 00000101
    byte num2 = 10;  // 00001010


    System.out.println(num1 | num2); // 0000 0101 | 0000 1010 == 0000 1111 == 15
    System.out.println(num1 & num2); // 0000 0101 & 0000 1010 == 0000 0000 == 0
    System.out.println(num1 ^ num2); // 0000 0101 ^ 0000 1010 == 0000 1111 == 15
    System.out.println(~num1);       // ~(0000 0101) = 1111 1010

    System.out.println(num1 << 2);   // 0000 0101 << 2 == 0001 0100 == 
    System.out.println(num1);
    System.out.println(num1 <<= 2);
    System.out.println(num1);

    System.out.println();


    // 리터럴 방식 할당은 객체 생성 없이 고정된 값을 그대로 대입하는데 
    // 값을 intern pool 이라는 곳에 저장하고 
    // 다음에 다시 동일한 문자열이 선언될 경우 cache된 문자열을 리턴함.
    String text1 = "text";
    String text2 = "text";
    String text3 = new String("text");
    String text4 = "text4";
    System.out.println(text1.equals(text2));
    System.out.println(text1.equals(text3));
    System.out.println(text1 == text3);
    System.out.println(text1 == text4);

    String message = "I like Java";
    System.out.println(message.indexOf("like"));
    System.out.println(message.indexOf("w"));

    String msgHello = "Hello World";
    System.out.println(msgHello.contains("Hello"));
    System.out.println(msgHello.contains("hello"));
    System.out.println(msgHello.contains("Hll"));

    System.out.println(msgHello.charAt(0)); // H 출력
    System.out.println(msgHello.charAt(6)); // W 출력
    //System.out.println(msgHello.charAt(11)); // java.lang.StringIndexOutOfBoundsException: String index out of range

    
    System.out.println(msgHello.replaceAll("World", "World1"));
    System.out.println(msgHello.substring(0));
    System.out.println(msgHello.substring(6));
    System.out.println(msgHello.substring(0, 4));

    System.out.println(msgHello.toUpperCase());
    System.out.println(msgHello.toUpperCase());
    System.out.println(msgHello.toLowerCase());

    String msgNotSplit = "2022-01-01";
    String[] msgSplit = msgNotSplit.split("-");
    for(String element: msgSplit) {
      System.out.println(element);
    }

    int number1 = 10;
    int number2 = 20;
    String stringMsg1 = String.format("number1 + number2 = %d\n", number1 + number2);
    String stringMsg2 = String.format("%%");
    System.out.println(stringMsg1);
    System.out.println(stringMsg2);
    
    String stringHello = String.format("%10s", "Hello");
    System.out.println(stringHello);
    
    String stringHelloWorld = String.format("%-10s %s", "Hello", "World");
    System.out.println(stringHelloWorld);

    StringBuffer sbHelloWorld = new StringBuffer();
    System.out.println(sbHelloWorld);
    sbHelloWorld.append("hello");
    sbHelloWorld.append(" ");
    sbHelloWorld.append("World");
    System.out.println(sbHelloWorld);

    String sHelloWorld = sbHelloWorld.toString();
    System.out.println(sHelloWorld);
    sbHelloWorld.insert(0, "java");
    System.out.println(sbHelloWorld);

    String sMsg = "";
    sMsg += "hello";
    sMsg += " ";
    sMsg += "world";
    System.out.println(sMsg);

    StringBuffer sb = new StringBuffer();
    sb.append("hello world");
    sb.insert(0, "java ");
    System.out.println(sb.toString());

    int[] numbers = {1, 2, 3, 4, 5};
    String[] strings1 = {"one", "two", "three", "four"};
    String[] strings2 = new String[7];

    for(int number: numbers) {
      System.out.println(number);
    }

    for(i=0; i<numbers.length;i++) {
      System.out.println(numbers[i]);
    }

    System.out.println(strings1.length);
    System.out.println(strings2.length);

    // List 자료형 중에서는 ArrayList, Vector, LinkedList 등의
    // List 인터페이스를 구현한 자료형이 있다.
    // List 자료형은 인터페이스임. 


    // J2SE 5.0 버전 이후 타입 명확히 표현 권고
    ArrayList<String> alNumbers = new ArrayList<String>();
    
    alNumbers.add("0");
    alNumbers.add("1");
    alNumbers.add("2");
    alNumbers.add("3");
    alNumbers.add(1, "4");

    for(String number: alNumbers ) {
      System.out.println(number);
    }

    // get 메소드 : 인덱스의 값을 가져옴
    System.out.println(alNumbers.get(1));

    // size 메소드 : 길이 출력
    System.out.println(alNumbers.size());

    // contains 메소드 : 요소가 들어있는지 여부를 boolean으로 반환
    System.out.println(alNumbers.contains("4"));
    System.out.println(alNumbers.contains(4));

    // remove(인덱스 or 객체) 메소드 : 요소 제거
    // 인덱스 : 인덱스의 요소를 제거하고, 삭제된 값을 반환
    // 객체 : 객체를 삭제하고, 삭제한 결과(boolean) 반환
    System.out.println(alNumbers.remove("4"));
    System.out.println(alNumbers.remove(0));
    System.out.println(alNumbers);

    // Generics : <String>, <Integer>, ....
    // ArrayList 안에 담을 수 있는 타입은 String 타입이라는 의미
    ArrayList<String> alItems1 = new ArrayList<String>();
    ArrayList<String> alItems2 = new ArrayList<>();


    // Generics를 사용하지 않으면 리스트 내부의 타입(자료형)은 Object 객체임
    // Object 객체는 모든 객체가 상속하고 있는 가장 기본적인 자료형(타입).
    // 따라서 Generics가 없는 alItems 에 값을 넣을때는 문제가 되지 않지만
    // alItems에 넣은 값을 꺼내서 다른 String 타입의 변수에 넣을 때는
    // String으로 캐스팅 해주지 않으면 오류가 발생함.
    ArrayList alItems3 = new ArrayList();
    alItems3.add("first");
    alItems3.add("second");
    
    // Generics로 내부에 들어갈 값의 타입을 지정하지 않으므로 
    // 다른 종류의 타입도 들어갈 수 있다.
    // 이렇게 되면 값을 꺼낼때 캐스팅 실수를 할 가능성도 있다.
    alItems3.add(true);
    alItems3.add(123);


    // alItems3.get(0)는 Object 타입이므로 String 타입에 넣으면 에러
    // String item0 = alItems3.get(0);

    // Object 타입의 값을 String 타입으로 캐스팅 해주면 정상 동작
    String item0 = (String)alItems3.get(0);
    String item1 = (String)alItems3.get(1);
    System.out.println(item0);
    System.out.println(item1);


    // ArrayList<String> alData = new ArrayList<>();
    // alData.add("0");
    // alData.add("1");
    // alData.add("2");
    // System.out.println(alData);

    String[] data1 = {"1", "2", "3"};
    ArrayList<String> alData1 = new ArrayList<>(Arrays.asList(data1));
    System.out.println(alData1);

    String[] data2 = {"1", "2", "3"};
    ArrayList<String> alData2 = new ArrayList<>(Arrays.asList("1", "2", "3"));
    System.out.println(alData2);


    ArrayList<String> alData3 = new ArrayList<>(Arrays.asList("1", "2", "3"));
    String result = "";
    for (i=0; i<alData3.size(); i++) {
      result += alData3.get(i);
      result += ",";
    }
    result = result.substring(0, result.length() - 1);
    System.out.println(result);

    // String.join
    ArrayList<String> alData4 = new ArrayList<>(Arrays.asList("1","2","3"));
    String result1 = String.join(",", alData4);
    System.out.println(result1);

    String[] testStrings = new String[]{"1", "2", "3"};
    String testString = String.join(",", testStrings);
    System.out.println(testString); 

    ArrayList<String> alData5 = new ArrayList<>(Arrays.asList("2", "1", "3", "5", "4"));
    alData5.sort(Comparator.naturalOrder());
    System.out.println(alData5);

    alData5.sort(Comparator.reverseOrder());
    System.out.println(alData5);

    // map 
    // 자바의 Map 은 파이썬의 딕셔너리와 비슷
    // Key - Value를 한 쌍으로 갖는 자료형
    // 배열과 리스트는 값을 찾기 위해 순차적으로 검색하지만
    // 배열과 리스트와 달리 순서에 의존하지 않고 Key 를 통해 Value를 얻음
    // 순서가 없기 떄문에 인덱싱을 지원하지 않음
    // Map은 인터페이스이며, Map 인터페이스를 구현한 Map 자료형에는
    // HashMap, LinkedHashMap, TreeMap 등이 있다.

    // HashMap
    // java.util.HashMap 을 import 해야한다.
    // Generics
    HashMap<String, String> map = new HashMap<>();
    
    // put 메소드 : Key - Value를 해쉬맵에 저장 
    map.put("first", "첫번째");
    map.put("second", "두번째");

    // get 메소드 : key에 해당하는 value 값을 불러옴
    System.out.println(map.get("first"));
    System.out.println(map.get("second"));

    // getOrDefault 메소드 : key에 해당하는 값이 없으면(null 이면)
    // 디폴트 값을 반환시킬 수 있음.
    System.out.println(map.getOrDefault("third", "자바"));
    System.out.println(map.getOrDefault("second", "자바"));

    // containskey 메소드 : 맵에 해당 key의 유무를 boolean으로 출력
    System.out.println(map.containsKey("first"));
    System.out.println(map.containsKey("third"));

    // remove 메소드 : Key 에 해당하는 item(key, value)를 삭제하고 value를 반환
    // key 가 없으면 null을 반환
    System.out.println(map.remove("first")); // "사람" 출력
    System.out.println(map.remove("third"));   // null 출력

    // size 메소드 : Map의 길이(요소의 개수) 반환
    System.out.println(map.size());

    // keySet 메소드 : Map에 있는 모든 key를 Set 타입으로 반환
    map.put("first", "첫번째");

    HashMap<String, String> map2 = new HashMap<>();
    map2.put("first", "첫번째");
    map2.put("second", "두번째");
    System.out.println(map.keySet());

    // LinkedHashMap : 입력된 순서대로 데이터를 저장
    // TreeMap : 입력된 key의 오름차순 순서로 데이터를 저장



    // Set
    // java.util.HashSet
    // HashSet, TreeSet, LinkedHashSet
    // Set 자료형은 인터페이스
    // Generics
    // 중복을 허용하지 않음
    // 리스트나 배열과 달리 순서가 없음
    // map과 마찬가지로 인덱싱을 지원하지 않음

    // HashSet
    HashSet<String> set = new HashSet<>(Arrays.asList("H","e", "l", "l","o"));
    System.out.println(set);
    // 중복을 허용하지 않기 때문에 e, H, l, o 만 출력

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


    // TreeSet : 오름차순으로 값을 정렬하여 저장
    // LinkedHashSet : 입력한 순서대로 값을 정렬하여 저장

    // Enum
    // 상수 집합을 정의할 경우에 사용
    // 매직넘버로 값을 주고 받는 경우보다 안전함

    System.out.println(Seasons.SPRING);
    System.out.println(Seasons.SUMMER);
    System.out.println(Seasons.FALL);
    System.out.println(Seasons.WINTER);

    for (Seasons season: Seasons.values() ) {
      System.out.println(season);
    }
  


  }
}
