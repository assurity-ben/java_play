import java.util.HashMap;

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
        P.printList(capitalCities);
    }

}

