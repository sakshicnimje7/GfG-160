import java.util.*;
class Solution13 { 
    static int missingNumber(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }
        
        for(int i = 1; i <= n; i++) {
            if(i != arr[i - 1]) {
                return i;
            }
        }
        
        return n + 1;
    }
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        
        System.out.println(missingNumber(arr));
    }
}
