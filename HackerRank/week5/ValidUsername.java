import java.util.*;
import java.util.regex.*;

public class ValidUsername {
    public static void solution (String s) {
        String regex = "^[a-zA-Z](\\w){7,29}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.find()) {
            System.out.println("Valid");
            return;
        }
        System.out.println("Invalid");
    }

    public static void main(String [] args) {
        solution("MyName");
        solution("MyName123");
        solution("Samantha_21");
    }
}