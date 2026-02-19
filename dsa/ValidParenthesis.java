import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid (String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            // check for opening breackets first
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else { // closing
                if(st.isEmpty()) {
                    return false;
                }

                if( (st.peek() == '(' && s.charAt(i) == ')') || 
                (st.peek() == '{' && s.charAt(i) == '}') || 
                (st.peek() == '[' && s.charAt(i) == ']')) {
                    st.pop();
                } else { // no match
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String [] args) {
        String s = "{[()]}";
        System.out.println("Is the string valid? " + isValid(s));
    }
}