package mypack;
public class Main {
    int x;

    public Main(int y) {
        x = y;
    }
    static void myMethod(String fname, int age) {
        System.out.println(fname + " reassess " + age);
    }

    static int add(int x, int y) {
        return x + y;
    }

    static double add(double x, double y) {
        return x + y;
    }

    static void main1() {
        System.out.println("Hello World!");
        /* This is a multi line comment
         */
        String name = "Ben";
        System.out.print("Regular print - name is: ");
        // This is a comment
        System.out.println(name);	// comment two
        int myNum = 35;
        myNum = 15;
        // Concatenation
        System.out.println(myNum + " " + name);
        // floating point scientific notation
        float f1 = 23e2f;
        double d2 = 56e4d;
        System.out.println("float f1 = " + f1);
        System.out.println(d2);
        System.out.println("max: " + Math.max(5, 10));
        System.out.println("min: " + Math.min(5, 10));
        System.out.println("sqrt: " + Math.sqrt(64));
        System.out.println("abs: " + Math.abs(-4.7));
        System.out.println("random: " + Math.random());
        int randomInt = (int)(Math.random() * 101);
        System.out.println("random int: " + randomInt);
        boolean isJavaFun = false;
        String prefix = (!isJavaFun) ? "not " : "";
        String message = "Java is " + prefix + "fun";
        System.out.println(message);

        // switch case example
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }

        // for loop example
        for (int i = 0; i < 5; i++) {
            System.out.println("i equals: " + i);
            if (i == 3) { break; }
        }

        // array example
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opal";
        for (String car : cars) {	// for:each example
            System.out.print(car + " ");
        }
        System.out.println("list has (" + cars.length + ") members");
        myMethod("Steve", 23);
        myMethod("Henry", 54);
        myMethod("Bob", 32);

        System.out.println(add(33, 66));
        double myNum2 = add(2.5, 6.7);
        System.out.println("double: " + myNum2);
    }

    public static int sum(int k) {
        // Adds all integers counting from 0 up to given parameter
        if (k > 0) {
            System.out.print(k + " + ");
            return k + sum(k -1);
        } else {
            System.out.print("0 = ");
            return 0;
        }
    }

    void myPublicMethod() {
        System.out.println("Public method");
    }
    public static int sum(int start, int end) {
        if (end > start) {
            System.out.print(end + " + ");
            return end + sum(start, end - 1);
        } else {
            System.out.print(end + " = ");
            return end;
        }
    }
}