import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerClass {
    public static void main(String[] args) {
        int x, y, sum;
        x = getInput();
        y = getInput();
        sum = x + y;
        P.print("Sum is: " + sum);
    }

    static int getInput() {
        int x;
        while(true) {
            try {
                Scanner myObj = new Scanner(System.in);
                P.print("Type a number:");
                x = myObj.nextInt(); //Read user input
                break;
            } catch (InputMismatchException e) {
                P.print("Input must be an integer.");
            }
        }
        return x;
    }
}
