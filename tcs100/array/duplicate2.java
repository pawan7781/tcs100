package array;

public class duplicate2 {
    public static void RemoveDuplicate2(int arr[])
    {
      
        int i =0;
        for(int j =1; j<arr.length; j++)
        {
            if(arr[i]!=arr[j])
            {
                
                i++;
                arr[i]=arr[j];
            }
           
        }
        i++;
        for(int k=0; k<i; k++)
        {
            System.out.println(arr[k]);
        }
    } 
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,3};
        RemoveDuplicate2(arr);
    }
}
// ///////////////////////////////////
// package array;

// public class duplicate2 {
//     public static int RemoveDuplicate2(int arr[])
//     {
      
//         int i =0;
//         for(int j =1; j<arr.length; j++)
//         {
//             if(arr[i]!=arr[j])
//             {
                
//                 i++;
//                 arr[i]=arr[j];
//             }
           
//         }
//         return i++;
        
       
//     } 
//     public static void main(String[] args) {
//         int arr[]={1,1,2,2,3,3,3};
//        int k= RemoveDuplicate2(arr);
//        for(int i=0; i<=k; i++)
//        {
//            System.out.println(arr[i]);
//        }
//     }
// }

