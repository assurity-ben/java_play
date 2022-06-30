import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class P {
    public static void print(Object in) {
        System.out.println(in);
    }

    public static void printList(Collection input) {
        Iterator it = input.iterator();
        while(it.hasNext()) {
            print(it.next());
        }
    }

    public static void printList(HashMap input) {
        // Print keys and values
        for (Object i : input.keySet()) {
            print("key: " + i + " value: " + input.get(i));
        }
    }
}
