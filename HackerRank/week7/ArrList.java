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