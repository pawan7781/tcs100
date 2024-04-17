package array;

import java.util.HashMap;
import java.util.Map;

//Remove Duplicates in-place from Sorted Array
public class duplicate1 {
    public static void RemoveDuplicate(int arr[])
    {
        Map<Integer, Integer> hm = new HashMap();
        for(int i =0; i<arr.length; i++)
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else
            {
                hm.put(arr[i], 1);
            }
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        RemoveDuplicate(arr);
        
    }
}
