package array;
//remove duplicate from unsorted arr-
//bruteforce approach-
public class unsortedDuplicate {
    public static void removedup(int arr[], int n)
    {  
        int mark[]=new int[n];
        for(int i =0; i<n; i++)
        {
            mark[i]=1;

        }

        ////
        for(int i=0; i<n; i++)
        {
            if(mark[i]==1)
            {
                for(int j=i+1; j<n; j++)
                {
                    if(arr[i]==arr[j])
                    {
                        mark[j]=0;
                    }
                }
            }
        }

        for(int i=0; i<n; i++)
        {
            if(mark[i]==1)
            {
                System.out.println(arr[i]);
            }
        }

        
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,9,3,1,3,9};
        int n=8;
        removedup(arr,n);
        
    }
    
}
