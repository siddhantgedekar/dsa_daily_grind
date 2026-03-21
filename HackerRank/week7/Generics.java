public class Generics {
    public static <E> void printArray (E[] arr) {
        for(E value : arr) {
            System.out.println(value);
        }
    }

    public static void main(String [] args) {
        String[] arr1 = {"Hello", "World"};
        Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        printArray(arr1);
        printArray(arr2);
    }
}