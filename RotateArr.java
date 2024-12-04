package Arrays;
public class RotateArr {

    public static void RorateArray(int arr[], int d)
    {
        int n= arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

    }
    public static void reverse(int arr[], int start, int end)
    {
        int n= arr.length;
        while(start<end)
        {
           int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,6,7,8,9};
        int d =4;
        RorateArray(arr, d);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }

}
