package array;



//Rearrange array in increasing-decreasing order
public class AscendDescend{
     static void solution(int arr[])
    {
        for(int i =0; i<arr.length; i++)
        {
            for(int j=1; j<arr.length; j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int i =0; i<arr.length/2; i++)
        {
            System.out.println(arr[i]);
        }
        for(int i =arr.length-1; i>=arr.length/2; i--)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,6,7,9,4,35,8};
        solution(arr);
    }
}
