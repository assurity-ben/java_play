import java.util.ArrayList;
import java.util.HashMap;

public class P {
    public static void print(Object in) {
        System.out.println(in);
    }

    public static void printList(ArrayList input) {
        for (Object i : input) {
            System.out.println(i);
        }
    }

    public static void printList(HashMap input) {
        for (Object i : input.keySet()) {
            System.out.println(i);
        }
    }
}
