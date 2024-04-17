package array;
//Reverse a given Array
public class reverseArr {

    public static void reverse(int arr[])
    {
        int beg=0;
        int end=arr.length-1;
        while(beg<end)
        {
            int temp=arr[beg];
            arr[beg]=arr[end];
            arr[end]=temp;
            beg++;
            end--;
        }
        for (int i : arr) {
                System.out.println(i);
            }
    }
    public static void main(String[] args) {
        int arr[]={5,6,4,7,9,1,3};
        // int ans[]=new int [arr.length];
        // for(int i =arr.length-1; i>=0; i--)
        // {
        //     ans[arr.length-i-1]=arr[i];
            
        // }
        // for (int i : ans) {
        //     System.out.println(i);
        // }
            reverse(arr);

    }
}
