import java.util.*;
import java.util.regex.*;

public class ValidPattern {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 0) {
            String pattern = sc.next();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            n--;
        }
    }
}