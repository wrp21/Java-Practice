package Problem.jumptojava.chap03;

import java.util.HashMap;


public class Q10 {

  enum CoffeeType {
    americano,
    iceAmericano,
    caffeeLatte
  };


  static void printCoffeePrice(CoffeeType type) {
      HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
      priceMap.put(CoffeeType.americano, 3000);
      priceMap.put(CoffeeType.iceAmericano, 4000);
      priceMap.put(CoffeeType.caffeeLatte, 5000);
      int price = priceMap.get(type);
      System.out.println(String.format("가격은 %d원 입니다.", price));
  }
  public static void main(String[] args) {
    printCoffeePrice(CoffeeType.americano);
    printCoffeePrice(CoffeeType.iceAmericano);
    printCoffeePrice(CoffeeType.caffeeLatte);
    // printCoffeePrice(99); // error

  }
}
