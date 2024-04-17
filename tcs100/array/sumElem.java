package array;
//Calculate Sum of the Elements of the Array
public class sumElem {
    public static void sum(int arr[], int sum)
    {
        for (int i =0; i<arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        int sum=0;
        sum(arr, sum);
    }
}
