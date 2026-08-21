class Solution {
    public int minOperations(String s) {
       int n = s.length();
        int ans = Integer.MAX_VALUE;
        for(int k = 0; k<n; k++){
            int operations =k;
            for(int i = 0; i<n/2; i++ ){
                    char left = s.charAt((i+k)%n);
                    char right = s.charAt((n-1-i+k)%n);
                    int d1 = (right - left+26)%26;
                    int d2 = (left - right +26)%26;
                    operations += Math.min(d1, d2);
            }
                ans = Math.min(ans, operations);
        }
         return ans;
    }  
}