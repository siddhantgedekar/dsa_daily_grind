import java.util.Stack;

public class ReverseWithStack {
    public static void main(String [] args) {
        StringBuilder s = new StringBuilder("siddhant");
        System.out.println("Original String: " + s);
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        s.setLength(0); // Clear the StringBuilder
        while(!stack.isEmpty()) {
            s.append(stack.pop());
        }
        System.out.println("Reversed String: " + s.toString());
    }
}