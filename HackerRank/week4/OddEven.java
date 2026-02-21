import java.util.Scanner;

public class OddEven {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        // inputs
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            String s = sc.next();
            
            StringBuilder evenStr = new StringBuilder();
            StringBuilder oddStr = new StringBuilder();
            
            // even indices
            for(int j=0; j<s.length(); j+=2) {
                evenStr.append(s.charAt(j));
            }
            
            // odd indices
            for(int j=1; j<s.length(); j+=2) {
                oddStr.append(s.charAt(j));
            }
            
            System.out.println(evenStr+" "+oddStr);
        }
    }
}