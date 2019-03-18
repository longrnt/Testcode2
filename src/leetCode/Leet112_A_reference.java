package leetCode;

public class Leet112_A_reference {
    // To find minimum count of unique elements. 
    static int minIncrementForUnique(int A[]) { 
        int[] count = new int[40001];
        for (int x: A) count[x]++;

        int ans = 0, taken = 0;

        for (int x = 0; x < 40001; ++x) {
            if (count[x] >= 2) {
                taken += count[x] - 1;
                ans -= x * (count[x] - 1);
            }
            else if (taken > 0 && count[x] == 0) {
                taken--;
                ans += x;
                
            }
        }

        return ans;
    } 
      
    // Drivers code 
    public static void main (String[] args) { 
      
        int A[] = {3, 2, 1, 2, 1, 7 }; 
          
        System.out.println(minIncrementForUnique(A)); 
    } 
}

