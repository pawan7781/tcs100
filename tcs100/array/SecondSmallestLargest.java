package array;

import java.util.Arrays;

//Find Second Smallest and Second Largest Element in an array
public class SecondSmallestLargest {
    public static int secondSmallest(int arr[])
    {   
        int smallest=arr[0];
        int secondsmall=Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++)
        {
           
            if(arr[i]<smallest)
            {
                
                secondsmall=smallest;
                smallest=arr[i];
                
            }
            else if(arr[i]<secondsmall && arr[i]!=smallest)
            {
                secondsmall=arr[i];
            }


        }
        return secondsmall;

    }
    public static int secondlargest(int arr[])
    {
        int largest=arr[0];
        int secondlarge= Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]>largest)
            {
                
                secondlarge=largest;
                largest=arr[i];

            }
            else if(arr[i]>secondlarge && arr[i]!=largest)
            {
                secondlarge=arr[i];
            }
        }
        return secondlarge;

    }
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 7, 7, 5};
     
       int large=secondlargest(arr);
       
        int small=secondSmallest(arr);
        int output[]={large, small};
        System.out.println(Arrays.toString(output));
    }
}
