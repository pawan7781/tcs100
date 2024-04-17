package array;

import java.util.HashMap;
import java.util.Map;

//Count frequency of each element in an array
public class count {
    public static void countFrequency(int arr[])
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++)
       {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
       }
       for (Map.Entry<Integer, Integer>entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
       }
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,6,3,2};
        countFrequency(arr);
    }
}
