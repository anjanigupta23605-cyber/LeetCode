class Solution {
    public int mySqrt(int n) {
        long low = 0, high=n;
        while(low<=high){
            long mid = (low+high)/2;
            if(mid*mid==n) return (int)mid;
            else if(mid*mid>n) high=mid-1;
            else low = mid+1;
        }
        return(int)high;
    }
}