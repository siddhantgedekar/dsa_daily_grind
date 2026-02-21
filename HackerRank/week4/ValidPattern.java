import java.util.*;
import java.util.regex.*;

public class ValidPattern {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // for now just use string
        String pattern = "([A-Z])(.+)";
        // int n = Integer.parseInt(sc.nextLine()); // not using nextInt() to prevent empty space storage conflict between nextInt() and nextLine()

        // while(n > 0) {
        //     String pattern = sc.nextLine();
        //     try {
        //         Pattern.compile(pattern);
        //         System.out.println("Valid");
        //     } catch (PatternSyntaxException e) {
        //         System.out.println("Invalid");
        //     }
        //     n--;
        // }
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }
}