import java.util.regex.*;

public class RegexTag {
    public static void Solution (String s) {
        String regex = "<([^>]+)>([^<]+)</\\1>";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        boolean found = false;
        while (m.find()) {
            System.out.println(m.group(2));
            found = true;

        }
        if(!found) {
            System.out.println("None");
        }
    }
    public static void main(String [] args) {
        String s = "<h1>Nayeem loves counseling</h1>";
        Solution(s);
        s = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>";
        Solution(s);
        s = "<Amee>safat codes like a ninja</amee>";
        Solution(s);
        s = "<SA premium>Imtiaz has a secret crash</SA premium>";
        Solution(s);
    }
}