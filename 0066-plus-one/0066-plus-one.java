class Solution {
    public int[] plusOne(int[] digits) {
       // int carry = 0;
        int n = digits.length-1;
        //int total =digits[i]+carry;
        for(int i = n;i>=0;i--){
            if(digits[i] == 9){
               digits[i]=0;
            }else{
                digits[i]++;
                return digits;            
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

}