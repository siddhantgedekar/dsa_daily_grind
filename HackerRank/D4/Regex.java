import java.util.*;

public class Regex {
    public static void main(String [] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
        if(0 == s.length() || s.length() > 4e5) return ;
        // sc.close();
        
        String[] cleaned = s.trim().split("[?!_.@,' +]");
        int count = 0;
        for(String word : cleaned) {
            if(!word.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
        for(String word : cleaned) {
            if(!word.isEmpty()) {
                System.out.println(word);
            }
        }
    }
}