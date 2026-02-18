public class CountingSort {
    // Implement counting sort concept
    public static void sort (int arr[]) {
        // store length of array
        int n = arr.length;
        // using this to find largest value in the array
        // so the countingArray size can be determined
        // which later helps in mapping every individual number to the index value
        // of that countingArray, this helps like a hash function, where each
        // value is mapped to the similar valued index in the counting array
        // ex:- value = 5, so at index 5 of countingArray we'll increment it's value
        // from 0 -> 1, which represents that value/number 5 is present in array at-least once,
        // it'll increment again if the number repeats in the array again. Which give us the count 
        // of each element in the actual array, now will be stored (i.e count) in the countArray
        int maxEl = 0;
        // iterate through array to find max element
        for(int i=0; i<n; i++) {
            if(arr[i] > maxEl) {
                maxEl = arr[i];
            }
        }
        // use that element + 1. If we have large value but the array size is less than that. It will cause error/won't be able to implement the concept correctly.
        // below line prevents indexing error.
        // ex: size = 3, maxEl = 4 so index --> [0,1,2] for actual array
        // but for countArr --> [0,1,2,3], hence when countArr[arr[some_index]]
        // when some_index == 4, then countArr is refering to the 4th index, which is '3'.
        // if size was not incremented by 1 for countArr then it would have thrown an error (index out of range).
        int countArr[] = new int[maxEl+1]; // NOTE:- we're considering case where 0 is present
        // here we're going through, each element in actual array, whose value will be a number
        // later treating it as index for countingArray and incrementing value at that particular index
        // ex: if countArr[arr[i]] gives --> countArr[arr[4]], say at arr[4] we have '3'
        // so arr[4] gives '3', then countArr[3] which is 0-->1-->'2th index' will
        for(int i=0; i<n; i++) {
            countArr[arr[i]]++;
        } // this loop will help store the count of every element from actual array

        System.out.println("Counting Array");
        for(int i=0; i<n; i++) {
            System.out.print(countArr[i] + " ");
        }
        System.out.println();

        // sort the actual array
        int idx = 0; // 
        for(int i=0; i<n; i++) { // loop from initial position
            while(countArr[i] != 0) { // check if current element is at index 0 is '0'. If so means the element isn't present in actual array
                arr[idx] = i; // if > 0, then we'll update actual array from initial/starting point
                idx++; // after updating 'idx' index
                countArr[i]--; // we'll decrement it's count from the countArry
            } // then repeat this steps for every element until, we sort the array.
        }
        // for(int i=0; i<n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    }

    public static void main(String [] args) {
        // array
        int arr[] = {3,5,1,6,6,7,8,3,2};
        sort(arr);
        System.out.println("Sorted Array");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}