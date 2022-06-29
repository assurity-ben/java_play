import java.util.ArrayList;
import java.util.Collections;

public class ArrayClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        P.print(cars);
        cars.remove(2);
        P.print(cars);
        cars.remove("BMW");
        P.print(cars);
        cars.add(1, "BMW2");
        P.print(cars);
        cars.add(2, "Ford2");
        P.print(cars);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(92);
        ints.add(72);
        ints.add(554);
        ints.add(67);
        ints.add(82);
        ints.add(47);
        P.print(ints);
        Collections.sort(cars);
        Collections.sort(ints);
        P.print(cars);
        P.print(ints);
        P.printList(cars);
    }
}
