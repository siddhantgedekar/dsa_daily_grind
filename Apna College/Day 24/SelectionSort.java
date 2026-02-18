public class SelectionSort {

    public static void print (int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort (int arr[]) {
        int len = arr.length;
        for(int i=0; i<len; i++) {
            int min_idx = i;
            for(int j=i+1; j<len; j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // swap the smallest element with the first position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        print(arr);
    }

    public static void main(String [] args) {
        int arr[] = {8,4,6,2,3,5,0,9,1,7}; // unsorted array
        sort(arr);
    }
}