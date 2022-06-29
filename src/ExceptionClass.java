public class ExceptionClass {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            P.print(myNumbers[10]);
        } catch (Exception e) {
            P.print("Something threw an exception.");
        } finally {
            P.print("in finally");
        }
    }
}
