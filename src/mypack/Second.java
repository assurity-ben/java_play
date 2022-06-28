package mypack;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = myScanner.nextLine();
        System.out.println("Username is: " + userName);

        Main myObj = new Main(6);
        System.out.println("x=" + myObj.x);
        System.out.println(myObj.sum(5));
        System.out.println(myObj.sum(5, 10));
//        myObj.main1();
        myObj.myPublicMethod();
    }
}
