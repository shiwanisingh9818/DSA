package Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Solution {
    ArrayList<Integer> leaders(int arr[]) 
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n=arr.length;
        int max=arr[n-1];
        for(int i=n-1; i>=0;i--)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                res.add(max);
            }
        }
        Collections.reverse(res);
        return res;
        
    }
}
class Start{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = {16,17,4,3,5,2};
        System.out.println(obj.leaders(arr));
    }
}
