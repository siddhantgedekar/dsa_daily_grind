# HackerRank Solutions

This README documents my solutions to various HackerRank problems, organized by weeks. Each section includes a brief problem explanation followed by the implemented Java code.

## Week 1

### Solve Me First
- **Problem Explanation**: Add two integers and return their sum, with constraints that each number is between 1 and 1000.
```
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
```

### Simple Array Sum
- **Problem Explanation**: Given an array of integers, find the sum of its elements.
```
import java.util.List;

public class SimpleArrSum {
    public static int arrSum (List<Integer> arr) {
        int sum = 0;
        for(int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
    public static void main(String [] args) {
        List<Integer> arr = List.of(1,2,3,4,5,6,7,8);
        System.out.println("Sum of array elements is: " + arrSum(arr));
    }
}
```

### Compare the Triplets
- **Problem Explanation**: Alice and Bob each have three ratings. Compare each rating: if Alice's is higher, she gets a point; if Bob's is higher, he gets a point; if equal, no points. Return the total points for Alice and Bob as a list.
```
import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static List<Integer> result (List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<>();
        res.add(0); // a's score
        res.add(0); // b's score
        // List.of(0,0); create an immutable list, hence ArrayList is needed
        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                res.set(0, res.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                res.set(1, res.get(1) + 1);
            }
        }
        return res;
    }
    public static void main(String [] args) {
        List<Integer> a = List.of(5, 6, 7);
        List<Integer> b = List.of(3, 6, 10);
        List<Integer> res = result(a, b);
        System.out.println("Result of ratings of a and b is: " + res.get(0) + " " + res.get(1));
    }
}
```

### A Very Big Sum
- **Problem Explanation**: Calculate and print the sum of a given array of large integers (using long to handle big numbers).
```
import java.util.ArrayList;
import java.util.List;

public class Verybigsum {
    public static long bigSum (List<Long> a) {
        long sum = 0;
        for(long i : a) {
            sum += i;
        }
        return sum;
    }
    public static void main(String [] args) {
        List<Long> a = List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        long res = bigSum(a);
        System.out.println("Sum of long numbers is: " + res);
    }
}
```

### Diagonal Difference
- **Problem Explanation**: Given a square matrix, calculate the absolute difference between the sums of its diagonals.
```
import java.util.List;
// get a matrix's diagonal difference
public class Diagonaldiff {
    public static int res (List<List<Integer>> matrix) {
        int[] sum = new int[2];
        int len = matrix.get(0).size()-1;
        for(int i=0; i<=len; i++) {
            sum[0] += matrix.get(i).get(i);
            sum[1] += matrix.get(len-i).get(i);
            System.out.println(sum[0]);
            System.out.println(sum[1]);
        }
        return Math.abs(sum[0]-sum[1]);
    }
    public static void main(String [] args) {
        List<List<Integer>> matrix = List.of(
            List.of(11, 2, 4),
            List.of(4, 5, 6),
            List.of(10, 8, -12)
        );
        // System.out.println(matrix.get(matrix.get(0).size() -1).get(0));
        int sum = res(matrix);
        System.out.println("Sum: "+sum);
    }
}
```

### Plus Minus
- **Problem Explanation**: Given an array of integers, calculate the ratios of positive, negative, and zero elements, and print them with 6 decimal places.
```
import java.util.List;
import java.util.ArrayList;

public class NumRatio {
    public static void findRatio (List<Integer> arr) {
        int pos = 0, neg = 0, zero = 0;
        for(int num : arr) {
            if(num > 0) {
                pos++;
            } else if(num < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        double len = arr.size();
        System.out.printf("%.6f%n",(pos/len));
        System.out.printf("%.6f%n",(neg/len));
        System.out.printf("%.6f%n",(zero/len));
    }
    public static void main(String [] args) {
        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        findRatio(arr);
    }
}
```

### Staircase
- **Problem Explanation**: Print a staircase of size n using # symbols, right-aligned.
```
public class Staircase {
    public static void stairs (int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j < n - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args) {
        int n = 6;
        stairs(n);
    }
}
```

### Mini-Max Sum
- **Problem Explanation**: Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
```
import java.util.List;
import java.util.ArrayList;

public class FourSum {
    public static void result (List<Integer> arr) {
        // in the previous solution of O(n2) i was beaten by the constraints..
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // find max and min element
        for(int num : arr) {
            sum += num;
            if(num < min) min = num;
            if(num > max) max = num;
        }
        System.out.println("Min: "+(sum - max)+" Max: "+(sum - min));
    }
    public static void main(String [] args) {
        List<Integer> arr = List.of(256741038,623958417,467905213,714532089,938071625);
        result(arr);
    }
}
```

## Week 2

### Birthday Cake Candles
- **Problem Explanation**: You are in charge of the cake for a child's birthday. Count how many candles are tallest.
```
import java.util.List;

public class TallestCandle {
    public static int solution (List<Integer> candles) {
        int tallest = Integer.MIN_VALUE;
        int count = 1;
        // Find the tallest candle then count how many there are
        // we can do it in two ways...

        // first my original one.
        for(int candle : candles) {
            if(candle > tallest) tallest = candle;
        }
        // now count
        for(int candle : candles) {
            if(candle == tallest) count++; // very simple and basic approach
        }

        // 2nd approach - single pass
        /*
        for(int candle : candles) {
            if(candle > tallest) {
                tallest = candle;
                count = 1; // reset count, if the value of tallest candles changes
                // this gives us opportunity to find height of the next tallest candle
                // which was not present up until now.
            } else if(candle == tallest) {
                count++; // this means we found the same tallest candle again
            }
        }
        */
        return count;
    }
    public static void main(String [] args) {
        List<Integer> candles = List.of(3, 1, 2, 3);
        System.out.println(solution(candles));
    }
}
```

### Time Conversion
- **Problem Explanation**: Convert a time from 12-hour AM/PM format to 24-hour military time.
```
public class TimeConversion {
    public static String solution (String s) {
        int hr = Integer.parseInt(s.substring(0,2));
        String ampm = s.substring(8, 10);
        /*if(ampm.equals("AM")) {
            if(hr == 12) {
                s = s.replace("12", "00");
            }
        } else {
            if(hr != 12) {
                hr += 12;
                s = s.replace(s.substring(0,2), hr+"");
            }
        } */
        if(hr == 12 && ampm.equals("AM")) {
            s = s.replace(s.substring(0,2), "00");
        } else if(hr < 12 && ampm.equals("PM")) {
            hr += 12;
            s = s.replace(s.substring(0,2), (hr+""));
        }
        return s.substring(0,8);
    }
    public static void main(String [] args) {
        String s = "07:05:45PM";
        System.out.printf("Converting %s -> %s\n",s,solution(s));
    }
}
```

## Week 3

### Apple and Orange
- **Problem Explanation**: Sam's house has an apple tree and an orange tree. Count how many apples and oranges fall on Sam's house.
```
import java.util.List;

public class CountAppleOrange {
    public static void solution (int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0, orangeCount = 0; // counting variables
        
        if(a < s && s < t && t < b) {
            // not loop through arrays
            for(int i=0; i<apples.size(); i++) {
                int range = (apples.get(i) + a);
                if( range >= s && range <= t) {
                    appleCount++;
                }
            }
            for(int i=0; i<oranges.size(); i++) {
                int range = (oranges.get(i) + b);
                if(range <= t && range >= s) {
                    orangeCount++;
                }
            }
        }
        
        System.out.println(appleCount + "\n" + orangeCount);
    }
    public static void main(String [] args) {
        List<Integer> apples = List.of(-2,2,1);
        List<Integer> oranges = List.of(5,-6);
        solution(7, 11, 5, 15, apples, oranges);
    }
}
```

### Grading Students
- **Problem Explanation**: Round each student's grade according to these rules: if the difference between the grade and the next multiple of 5 is less than 3, round up; otherwise, leave it as is. Grades below 38 are failing and should not be rounded.
```
import java.util.List;
import java.util.ArrayList;

public class GradingStudent {
    public static List<Integer> solution (List<Integer> grades) {
        for(int i=0; i<grades.size(); i++) {
            // if value >= 38
            if ( grades.get(i) >= 38 ){
                // find current element's next multiple of 5
                int modulus = grades.get(i)%5;
                int multiple = modulus != 0 ? ((5 - modulus) + grades.get(i)) : grades.get(i);
                if((multiple - grades.get(i)) < 3) {
                    grades.set(i, multiple);
                }
            }
        }
        return grades;
    }

    public static void main(String [] args) {
        List<Integer> q = new ArrayList<>();
        q.add(37);q.add(38);

        System.out.println(solution(q));
    }
}
```

## Week 4

### Anagram
- **Problem Explanation**: Check if two strings are anagrams of each other (contain the same characters with the same frequencies).
```
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
```

### Let's Review
- **Problem Explanation**: For each string, print its even-indexed and odd-indexed characters as space-separated strings.
```
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
```

### Java Regex
- **Problem Explanation**: Split a string into tokens using delimiters and count the number of non-empty tokens.
```
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
```

### Pattern Syntax Checker
- **Problem Explanation**: Check if a given regex pattern is valid.
```
import java.util.*;
import java.util.regex.*;

public class ValidPattern {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // for now just use string
        String pattern = "([A-Z])(.+)";
        // int n = Integer.parseInt(sc.nextLine()); // not using nextInt() to prevent empty space storage conflict between nextInt() and nextLine()

        // while(n > 0) {
        //     String pattern = sc.nextLine();
        //     try {
        //         Pattern.compile(pattern);
        //         System.out.println("Valid");
        //     } catch (PatternSyntaxException e) {
        //         System.out.println("Invalid");
        //     }
        //     n--;
        // }
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }
}
```

## Week 5

### Duplicate Words
- **Problem Explanation**: Remove duplicate consecutive words from a string, keeping only the first occurrence.
```
import java.util.*;
import java.util.regex.*;

public class Regexrepeat {
    public static void main(String [] args) {
        String s = "Goodbye bye bye world world world";
        
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        if(m.find()) {
            System.out.println(m.replaceAll("$1"));
        } else {
            System.out.println(-1);
        }

        /*
        Hacker Rank solution:
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String regex = "\\b(\\w+)(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            Matcher m = p.matcher(s);

            System.out.println(m.replaceAll("$1"));
        }
        */
        sc.close();
    }
}
```

### Tag Content Extractor
- **Problem Explanation**: Extract the content from valid HTML tags where the opening and closing tags match.
```
import java.util.regex.*;

public class RegexTag {
    public static void Solution (String s) {
        String regex = "<([^>]+)>([^<]+)</\\1>";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        boolean found = false;
        while (m.find()) {
            System.out.println(m.group(2));
            found = true;

        }
        if(!found) {
            System.out.println("None");
        }
    }
    public static void main(String [] args) {
        String s = "<h1>Nayeem loves counseling</h1>";
        Solution(s);
        s = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>";
        Solution(s);
        s = "<Amee>safat codes like a ninja</amee>";
        Solution(s);
        s = "<SA premium>Imtiaz has a secret crash</SA premium>";
        Solution(s);
    }
}
```

### Validating IP Addresses
- **Problem Explanation**: Check if a given string is a valid IPv4 address.
```
import java.util.*;
import java.util.regex.*;

public class ValidIp {
    public static void isValid (String s) {
        String pattern = "^((0|1)?\\d{1,2}|2[0-4]\\d|25[0-5])(\\.((0|1)?\\d{1,2}|2[0-4]\\d|25[0-5])){3}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        if(m.find()) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
    }
    public static void main(String [] args) {
        String s = "000.12.12.034";
        isValid(s);
    }
}
```

### Valid Username Regular Expression
- **Problem Explanation**: Validate usernames based on specific rules: start with a letter, contain only alphanumeric characters and underscores, length between 8 and 30.
```
import java.util.*;
import java.util.regex.*;

public class ValidUsername {
    public static void solution (String s) {
        String regex = "^[a-zA-Z](\\w){7,29}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.find()) {
            System.out.println("Valid");
            return;
        }
        System.out.println("Invalid");
    }

    public static void main(String [] args) {
        solution("MyName");
        solution("MyName123");
        solution("Samantha_21");
    }
}
```

## Week 6

### Java BigInteger
- **Problem Explanation**: Perform addition and multiplication on two large integers using BigInteger.
```
import java.util.*;
import java.math.*;

public class Bigint {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
```

### Java Primality Test
- **Problem Explanation**: Determine if a given large number is prime using BigInteger's isProbablePrime method.
```
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
```

### 2D Array - DS
- **Problem Explanation**: Find the maximum hourglass sum in a 6x6 2D array.
```
import java.util.*;

public class MatrixSum {
    public static void main(String [] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(1,1,1,0,0,0));
        arr.add(List.of(0,1,0,0,0,0));
        arr.add(List.of(1,1,1,0,0,0));
        arr.add(List.of(0,9,2,-4,-4,0));
        arr.add(List.of(0,0,0,-2,0,0));
        arr.add(List.of(0,0,1,-2,-4,0));

        List<Integer> result = new ArrayList<>();
        
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=4; j++) {
                // mid
                int mid = arr.get(i).get(j);
                
                // top
                int t1 = arr.get(i-1).get(j-1);
                int t2 = arr.get(i-1).get(j);
                int t3 = arr.get(i-1).get(j+1);
                
                // bottom
                int b1 = arr.get(i+1).get(j-1);
                int b2 = arr.get(i+1).get(j);
                int b3 = arr.get(i+1).get(j+1);
                
                // sum
                int sum = t1+t2+t3+mid+b1+b2+b3;
                
                result.add(sum);
            }
        }
        
        int res = Collections.max(result);
        System.out.println(res);
    }
}
```

### Subarray Division (Negative Subarrays)
- **Problem Explanation**: Count the number of subarrays in an array that have a negative sum.
```
import java.io.*;
import java.util.*;

public class NegativeSubarr {
    public static void main(String [] args) {

        int[] arr = {1, -2, 4, -5, 1};

        int count = 0;
        int len = arr.length;
                
        // subarrays
        for(int i=0; i<len; i++) {
            int sum = 0;
            for(int j=i-1; j<len; j++) {
                sum += arr[j];
                if(sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```

## Week 7

### Array List Queries
- **Problem Explanation**: Given a list of lists (2D array) and a set of query coordinates, print the element at each query position (1-indexed). If the query is out of bounds, print `ERROR!`.
```
import java.util.*;

public class ArrList {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        List<List<Integer>> list = new ArrayList<>();

        // first 5 inputs
        String[] inp = {"41 77 74 22 44", "12", "37 34 36 52", "0", "20 22 33"};
        String[] quries = {"1 3", "3 4", "3 1", "4 3", "5 5"};

        for(int i = 0; i < n; i++) {
            String[] temp = inp[i].split(" ");
            List<Integer> l = new ArrayList<>();
            for(String s : temp) {
                l.add(Integer.parseInt(s));
            }
            list.add(l);
        }

        // print output
        for(String s : quries) {
            try {
                String[] temp = s.split(" ");
                int i = Integer.parseInt(temp[0]);
                int j = Integer.parseInt(temp[1]);
                System.out.println(list.get(i - 1).get(j - 1));
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
```

### 1D Array (Part 2)
- **Problem Explanation**: Given a game represented by an array of 0s (free) and 1s (blocked), a player starts at index 0 and can move forward by 1, backward by 1, or jump forward by `leap`. The goal is to determine whether the player can reach the end of the array (or beyond) without landing on a blocked cell. The solution performs a depth-first search and marks visited cells to avoid infinite looping.
```
public class ArrList2 {
    public static boolean canWin (int leap, int[] game, int i) {
        if(i >= game.length)
            return true;

        if(i < 0 || game[i] == 1)
            return false;

        game[i] = 1; // mark visited

        return canWin(leap, game, i + leap) ||
            canWin(leap, game, i + 1) ||
            canWin(leap, game, i - 1);
    }

    public static void main(String [] args) {
        int leap = 3;
        int[] game = {0, 0, 0, 0, 0, 0};

        System.out.println(canWin(leap, game, 0) ? "YES" : "NO");
    }
}
```

### List Operations
- **Problem Explanation**: A program that allows users to create an integer list, then perform insert and delete operations interactively. Users can add elements at specific indices or remove elements by index, with the list printed after each set of operations.
```
import java.io.*;
import java.util.*;

public class ListOperation {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element count: ");
        int N = sc.nextInt();
        System.out.println("-----Enter Elements-----");
        for(int i=0; i<N; i++) {
            System.out.print("Element at idx: "+i+": ");
            list.add(sc.nextInt());
        }
        String ch = sc.nextLine();
        while(ch != "q"){
            System.out.print("Enter queries count: ");
            int Q = sc.nextInt();
            String q = sc.nextLine();
            for(int i=0; i<Q; i++) {
                System.out.print("Enter query "+(i+1)+" (Types: Insert '5 23'/Delete '0'): ");
                q = sc.nextLine();
                if(q.equals("Insert")) {
                    System.out.print("\nEnter index: ");
                    int idx = Integer.parseInt(sc.nextLine());
                    System.out.print("\nEnter value: ");
                    int val = Integer.parseInt(sc.nextLine());
                    list.add(idx, val);
                }
                if(q.equals("Delete")) {
                    System.out.print("Enter element index to delete: ");
                    int inp = Integer.parseInt(sc.nextLine());
                    list.remove(inp);
                }
            }
            for(int i=0; i<list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            System.out.println("***Quit using 'q', else 'c'***");
            ch = sc.nextLine();
        }
    }
}
```

### Phone Book (HashMap)
- **Problem Explanation**: Create a phone book using a HashMap to store name-phone number pairs, then perform lookups to find phone numbers by name or print "Not found" if the name doesn't exist in the phone book.
```
import java.io.*;
import java.util.*;

public class Hashmap {
    public static void main(String [] args) {
        // Scanner sc = new Scanner(System.in);
        // int N = Integer.parseInt(sc.nextLine());
        // entry map
        Map<String, String> phoneBook = new HashMap<>();
        // entries
        String[] entry = "uncle sam=99912222,tom=11122222,harry=12299933".split(",");
        for(String query : entry) {
            String name = query.split("=")[0];
            String phone = query.split("=")[1];
            phoneBook.put(name, phone);
        }

        // queries
        String[] queries = "uncle sam,uncle tom,harry".split(",");
        for(String query : queries) {
            if(phoneBook.containsKey(query)) {
                System.out.println(query+"="+phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
```

### HashSet (Phone Book Pairs)
- **Problem Explanation**: Given a list of pairs of names, use a HashSet to track unique pairs. For each pair encountered, add it to the set (avoiding duplicates) and print the current size of the set after each addition.
```
import java.util.*;

public class Hashset {
    public static void main(String [] args) {
        String[] arr = "john tom,john mary,john tom,mary anna,mary anna".split(",");

        Set<String> set = new HashSet<>();

        // alternate approach, where hacker rank bugged
        // String[] pair_left = new String[arr.length];
        // String[] pair_right = new String[arr.length];

        // for(int i=0; i<arr.length; i++) {
        //     String[] name = arr[i].split(" ");
        //     pair_left[i] = name[0];
        //     pair_right[i] = name[1];
        // }

        // for(int i=0; i<arr.length; i++) {
        //     String name = (pair_left[i].compareTo(pair_right[i]) <= 0) ? (pair_left[i] + " " + pair_right[i]) : (pair_right[i] + " " + pair_left[i]);

        //     set.add(name);
        //     System.out.println(set.size());
        // }

        // Simple approach
        for(String name : arr) {
            set.add(name);
            System.out.println(set.size());
        }
    }
}
```
```