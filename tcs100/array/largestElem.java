package array;

public class largestElem {
    public static void main(String[] args) {
        int arr[]={6,2,7,3,9,1,4,2,0};
        // we can also solve this problem using sort method

        int largest=0; 
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
