import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashClass {
    public static void main(String[] args) {
        // Create a HashMap called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add key, value pairs (Country, Capital city)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        P.print(capitalCities);
        P.print(capitalCities.size());
        P.print("==Countries==");
        P.printList(capitalCities.keySet());
        P.print("==Cities==");
        P.printList(capitalCities.values());
        P.printList(capitalCities);

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        P.printList(people);

        HashSet<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Nissan");
        cars.add("Kia");
        cars.add("Great Wall");
        System.out.println(cars);
        P.printList(cars);

        Iterator<String> it = cars.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if(s == "Kia") {
                it.remove();
            }
        }

        Integer myInt = 100;
        String myString = myInt.toString();
        P.print(myString);
        System.out.println(myString.length());
    }
}

