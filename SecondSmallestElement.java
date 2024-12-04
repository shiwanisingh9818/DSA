package Arrays;
public class SecondSmallestElement
 {
    public static int SecSmallestElement(int arr[])
    {
        int SecondSmallestElement;
        int smallest = SecondSmallestElement = Integer.MAX_VALUE;
        
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                SecondSmallestElement = smallest;
                smallest = arr[i];
            }
            if(arr[i]>smallest && arr[i]<SecondSmallestElement)
            {
                SecondSmallestElement = arr[i];
            }

          
        }
        return SecondSmallestElement;

    }
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 1};
        System.out.println("Second Smallest Element is : "+SecSmallestElement(arr));
    }
}
