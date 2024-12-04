package Arrays;
//{ Driver Code Starts
import java.io.*;
import java.util.*;



class Solutionn {
    public int missingNumber(int[] nums) {
         int n = nums.length +1;
        int total =( n *(n-1))/2;
         for(int i=0; i< nums.length;i++)
         {
            total=total-nums[i];
         }
         return total;
    }

    public char[] leaders(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'leaders'");
    }
}

class Mainn {
    public static void main(String[] args) {
        //int arr[] = {1, 2, 3, 4, 5, 6, 7, 7, 7, 10};
        Solution obj = new Solution();
        int[] nums = {3,0,1};
        System.out.println(obj.missingNumber(nums));
        

    }
}
