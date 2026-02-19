import java.util.Stack;

public class Q5SortStrArr {
    public static void sortStr (String [] str) {
        // sort strings in ascending order
        // for(int i=0; i<str.length-1; i++) {
        //     for(int j=i+1; j<str.length; j++) {
        //         if(str[i].toLowerCase().charAt(0) > str[j].toLowerCase().charAt(0)) {
        //             // swap
        //             String temp = str[i];
        //             str[i] = str[j];
        //             str[j] = temp;
        //         }
        //     }
        // }
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j].compareToIgnoreCase(str[j + 1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String [] args) {
        String [] str = {"apple", "kiwi", "alfanzo", "Orange", "banana", "Mango", "grape"};

        sortStr(str);

        // print the sorted array
        for(String s : str) {
            System.out.println(s);
        }
    }
}