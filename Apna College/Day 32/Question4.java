// print non repeating letters using Queue
import java.util.Queue;
import java.util.LinkedList;

public class Question4 {

    public static void nonRepeating (String letter) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        int len = letter.length();

        for(int i=0; i<len; i++) {
            char ch = letter.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
        }
        if (q.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(q.peek());
        }
    }

    public static void main(String [] args) {
        // code
        String letters = "aabccxb";
        nonRepeating(letters);
    }
}