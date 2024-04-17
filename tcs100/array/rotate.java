package array;

public class rotate {
    public static void rotateArr(int arr[], int k)
    {
        for(int i =0; i<k; i++)
        {
            leftSwap(arr);
        }
    }
    public static void leftSwap(int arr[])
    {
        int temp =arr[0];
        for(int i =0; i<arr.length-1; i++)
        {
           
            arr[i]=arr[i+1];
            
        }
        arr[arr.length-1]=temp;
        
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        rotateArr(arr, k);
        for(int i =0 ; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
