import java.util.*;

public class Anagram {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // String a = sc.next().toLowerCase();
        // String b = sc.next().toLowerCase();
        String a = "anagram";
        String b = "margana";
        sc.close();
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        if(str1.length != str2.length) {System.out.println("Not Anagrams"); return;}
        
        if(Arrays.equals(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}