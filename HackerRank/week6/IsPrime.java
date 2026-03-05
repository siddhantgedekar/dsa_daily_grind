// Perform prime num calculation using BigInteger class and it's methods
import java.util.*;
import java.math.*;

public class IsPrime {
    public static void prime (String n) {
        BigInteger b = new BigInteger(n);

        if(b.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        prime(n);
    }
}