import java.util.ArrayList;
import java.util.Collections;

public class ArrayClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        print(cars);
        cars.remove(2);
        print(cars);
        cars.remove("BMW");
        print(cars);
        cars.add(1, "BMW2");
        print(cars);
        cars.add(2, "Ford2");
        print(cars);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(92);
        ints.add(72);
        ints.add(554);
        ints.add(67);
        ints.add(82);
        ints.add(47);
        print(ints);
        Collections.sort(cars);
        Collections.sort(ints);
        print(cars);
        print(ints);
    }
    static void printList(ArrayList input) {
        for (Object i : input) {
            System.out.println(i);
        }
    }

    static void print(Object input) {
        System.out.println(input);
    }

}
