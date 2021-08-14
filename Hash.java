import java.util.HashMap;
import java.util.HashSet;

public class Hash {
  public static void main(String[] args) {
	  
    HashMap<String, Integer> capitalCities = new HashMap<String, Integer>();
    
    capitalCities.put("England", 5);
    capitalCities.put("Germany", 10);
    capitalCities.put("Norway", 15);
    capitalCities.put("USA", 20);
    
    System.out.println(capitalCities); 
    System.out.println(capitalCities.get("USA"));
    System.out.println(capitalCities.size());
    
    for(String i : capitalCities.keySet()) {
    	System.out.println(i);
    }
    
    for(Integer i : capitalCities.values()) {
    	System.out.println(i);
    }
    
    for (String i : capitalCities.keySet()) {
        System.out.println("key: " + i + " value: " + capitalCities.get(i));
     }
    
    HashSet<Integer> numbers = new HashSet<Integer>();

    numbers.add(4);
    numbers.add(7);
    numbers.add(8);

    for(int i = 1; i <= 10; i++) {
      if(numbers.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
  }
}