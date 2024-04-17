package array;

public class avg {
    public static int average(int arr[],int sum, int av)
    {
        for(int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];
        }
        return (sum/arr.length);

    }
    public static void main(String[] args) {
        int arr[]={7,5,3,6,9,1,4,8,2};
        int av=0;
        int sum=0;
        int A=average(arr, sum, av);
        System.out.println(A);

    }
}
