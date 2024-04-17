package array;
//remove duplicate from  unsorted array-
//optimal approach
import java.util.HashMap;
import java.util.Map;

public class unsortedDuplicate2 {

    public static void removeDuplicates(int arr[])
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> i : hm.entrySet()) {
            System.out.println(i.getKey());
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,9,3,1,3,9};
        removeDuplicates(arr);
    }
}
