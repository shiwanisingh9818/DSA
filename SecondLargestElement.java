package Arrays;
import java.util.Arrays;

 class SecondLargestElement
{
    //int arr[];
    static int SecLargestElement(int arr[])
    {
        int n = arr.length;
        int largest=-1;
        int secondLargest=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest = arr[i];
            }
            if(arr[i]<largest && secondLargest<arr[i])
            {
                secondLargest=arr[i];
            }
        }
                return secondLargest;
    }

    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 60, 50};
      //  int n = arr.length;
       // SecondLargestElement obj = new SecondLargestElement();
       System.out.println( SecLargestElement(arr));
       //System.out.println(Tiz);
    }
}
