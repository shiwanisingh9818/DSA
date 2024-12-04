package Arrays;
 class DistinctElement {
    public static int countDistinctElements(int arr[], int n) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            boolean isDistinct = true;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct) {
                count++;
            }
        }
        return count;
    }
}

class nMain {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,7,10};
        int n = arr.length;
        int count = DistinctElement.countDistinctElements(arr, n);
        System.out.println("The number of distinct elements are: " + count);
    }
}
