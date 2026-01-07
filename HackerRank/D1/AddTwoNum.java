import java.util.Scanner;

public class AddTwoNum {
    static int solveMeFirst(int a, int b) {
      // Hint: Type return a+b; below
      if((1 <= a && a <= 1000) && (1 <= b && b <= 1000)) {
        return a+b;
      }
      return 0;
	}

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.print("Number 1: ");
        a = in.nextInt();
        int b;
        System.out.print("Number 2: ");
        b = in.nextInt();
        in.close();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
