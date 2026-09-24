class Solution {
    public int secondHighest(String s) {

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {

                int digit = ch - '0';

                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                }
                else if (digit < largest && digit > secondLargest) {
                    secondLargest = digit;
                }
            }
        }

        return secondLargest;
    }
}