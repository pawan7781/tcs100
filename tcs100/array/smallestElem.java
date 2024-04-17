//Find the smallest element in an array
package array;
public class smallestElem
{
    public static void main(String[] args) {
        int arr[]={5,6,2,1,10};
        int min=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(min>=arr[i])
            {
                min=arr[i];
            }
            
        }
        System.out.println(min);
        
    }
}