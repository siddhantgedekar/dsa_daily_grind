public class MergeSort {

    public static void sort (int[] arr, int si, int ei) {
        int mid = si + (ei - si)/2;

        sort(arr, si, mid); // left part
        sort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei);
    }

    public static void merge (int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++; k++;
            } else {
                temp[k] = arr[j];
                j++; k++;
            }
        }
    }

    public static void main(String [] args) {
        // 
    }
}