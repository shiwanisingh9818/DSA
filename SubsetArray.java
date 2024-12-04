package Arrays;
//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        // Create a hash map to store the frequencies of elements in array a1
        HashMap<Long,Integer> hm=new HashMap<>();
        
        // Increment the frequency of each element in array a1
        for(int i=0;i<n;i++){
            hm.put(a1[i],hm.getOrDefault(a1[i],0)+1);
        }
        
        // Check if each element in array a2 is present in array a1 and decrement its frequency
        for(int i=0;i<m;i++){
            if(hm.containsKey(a2[i])){
                // If frequency becomes 1, remove the element from the hash map
                if(hm.get(a2[i])==1){
                    hm.remove(a2[i]);
                }else{
                    // Decrement the frequency of the element
                    hm.put(a2[i],hm.get(a2[i])-1);
                }
            }else{
                // If an element in array a2 is not present in array a1, return "No"
                return "No";
            }
        }
        
        // If all elements in array a2 are present in array a1, return "Yes"
        return "Yes";
    }
}