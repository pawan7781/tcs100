package array;
// Adding Element in an Array
public class addElem {
    public static int insertatpos(int arr[], int key, int pos)
    {
        for(int i=arr.length-2; i>=pos; i-- )
        {
            arr[i]=arr[i-1];
        }
        arr[pos]=key;
        return arr.length+1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,0};

        int key=7;
        int pos=3;
        int k=insertatpos(arr, key, pos);
        for(int i=0; i<=k; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
