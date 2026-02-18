import java.util.Stack;

public class Q4Operations {

    public static int solution (String[] str) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        if(str.length == 1) return Integer.parseInt(str[0]);
        if(str.length == 0) return result;
        for(String s : str) {
            if(s.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } else if(s.equals("D")) {
                int a = stack.peek();
                stack.push(2 * a);
            } else if(s.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String [] args) {
        String [] str = {"5","2","C","D","+"};
        System.out.println(solution(str));
    }
}