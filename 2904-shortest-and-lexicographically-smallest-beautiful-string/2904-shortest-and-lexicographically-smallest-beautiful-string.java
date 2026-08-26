class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int left = 0;
        int ones = 0;
        String ans = "";

        for (int right = 0; right < s.length(); right++) {

            // Count 1
            if (s.charAt(right) == '1') {
                ones++;
            }

            // If there are more than k ones,
            // move left forward
            while (ones > k) {

                if (s.charAt(left) == '1') {
                    ones--;
                }

                left++;
            }

            // Remove unnecessary zeros from the beginning
            while (ones == k && s.charAt(left) == '0') {
                left++;
            }

            // We have exactly k ones
            if (ones == k) {

                String candidate = s.substring(left, right + 1);

                // Choose shortest
                // If same length, choose lexicographically smaller
                if (ans.equals("")
                        || candidate.length() < ans.length()
                        || (candidate.length() == ans.length()
                            && candidate.compareTo(ans) < 0)) {

                    ans = candidate;
                }
            }
        }

        return ans;
    }
}