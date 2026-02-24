import java.util.*;
import java.util.regex.*;

public class Regexrepeat {
    public static void main(String [] args) {
        String s = "Goodbye bye bye world world world";
        
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        if(m.find()) {
            System.out.println(m.replaceAll("$1"));
        } else {
            System.out.println(-1);
        }

        /*
        Hacker Rank solution:
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String regex = "\\b(\\w+)(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            Matcher m = p.matcher(s);

            System.out.println(m.replaceAll("$1"));
        }
        */
        sc.close();
    }
}