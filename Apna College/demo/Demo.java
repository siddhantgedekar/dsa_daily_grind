import java.util.Stack;

public class Demo {

    public static void fibo (int num) {
        int a = 0, b = 1, sum = 0;
        System.out.print(a + " " + b);
        for(int i=0; i<num; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
        }
        System.out.println();
    }

    public static int fact (int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n-1);
        }
    }

    public static String reverse (String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder s = new StringBuilder(str);
        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        s.setLength(0); // Clear the StringBuilder
        while(!stack.isEmpty()) {
            s.append(stack.pop());
        }
        return s.toString();
    }

    public static int duplicate (String s) {
        int count = 1;
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String [] args){
        // fibonacci series
        fibo(10);
        // reverse a string
        String s = "exaggration";
        System.out.println("Original String: " + s);
        System.out.println("Reveresed String: " + reverse(s));
        // factorial
        System.out.println("Factorial of 5 is " + fact(5));
        // permutations
        int sum = 0, len = s.length();
        // find duplicates in the string
        int dup = duplicate(s);
        sum = fact(len) / fact(dup);
        System.out.println("Permutation of siddhant: "+sum);
    }
}