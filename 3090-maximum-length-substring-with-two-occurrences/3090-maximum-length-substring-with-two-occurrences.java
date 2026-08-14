class Solution {
    public int maximumLengthSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        return count(s, 0, 0, 0);
    }

    static int count(String s, int start, int end, int max) {

        if (end == s.length()) {
            return max;
        }

        int[] freq = new int[26];

        for (int i = start; i <= end; i++) {
            freq[s.charAt(i) - 'a']++;

            if (freq[s.charAt(i) - 'a'] > 2) {
                return count(s, start + 1, end, max);
            }
        }

        max = Math.max(max, end - start + 1);

        return count(s, start, end + 1, max);
    }
}