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