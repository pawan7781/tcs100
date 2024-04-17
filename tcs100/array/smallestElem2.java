package array;

import java.util.Arrays;

//Find the smallest element in an array

public class smallestElem2 {
    public static void main(String[] args) {
        int arr[]={5,6,7,2,9,1,0,4};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
