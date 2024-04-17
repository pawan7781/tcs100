package array;

import java.util.Arrays;

//Find Median of the given Array
public class median {
    public static void medianelem(int arr[])
    {
        Arrays.sort(arr);
        if(arr.length%2==0)
        {
            System.out.println((double)(arr[arr.length/2]+arr[(arr.length/2)-1])/2);
             
        }
        else
        {
            System.out.println(arr.length/2);
        }

    }
    public static void main(String[] args) {
        int arr[]={5,6,2,1,7,9};
        medianelem(arr);
        

    }
    
}
