import java.util.*;
import java.util.regex.*;

public class ValidIp {
    public static void isValid (String s) {
        String pattern = "^((0|1)?\\d{1,2}|2[0-4]\\d|25[0-5])(\\.((0|1)?\\d{1,2}|2[0-4]\\d|25[0-5])){3}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        if(m.find()) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
    }
    public static void main(String [] args) {
        String s = "000.12.12.034";
        isValid(s);
    }
}