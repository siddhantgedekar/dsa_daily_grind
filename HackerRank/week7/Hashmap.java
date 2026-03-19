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