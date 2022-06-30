import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.forEach(P::print);
    }
}

class Lambda2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(9);
        Consumer<Integer> method = P::print;
        numbers.forEach(method);
    }
}

interface StringFunction {
    String run(String str);
}

interface Print {
    void print(Object obj);
}

class Lambda3 {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

        Print p = System.out::println;
        p.print("some string");
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}