package array;
//bruteforce
// Find all repeating elements in an array
public class repeatingElem {
    public static void repeat(int arr[])
    {
        int count=0;
        int duplicate[]=new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    duplicate[count++]=arr[i];
                }
            }
        }
        for(int i=0; i<count; i++)
        {
            System.out.println(duplicate[i]);
        }


    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,4,5,2};
        repeat(arr);
    }
}
