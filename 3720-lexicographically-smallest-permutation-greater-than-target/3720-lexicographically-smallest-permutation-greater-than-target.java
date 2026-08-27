class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {

            int[] freq = new int[26];

            // Count characters of s
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            boolean possible = true;

            // Try to match target[0 ... i-1]
            for (int j = 0; j < i; j++) {
                int index = target.charAt(j) - 'a';

                if (freq[index] == 0) {
                    possible = false;
                    break;
                }

                freq[index]--;
            }

            if (!possible) {
                continue;
            }

            // At position i, choose a character
            // greater than target[i]
            int curr = target.charAt(i) - 'a';

            for (int c = curr + 1; c < 26; c++) {

                if (freq[c] > 0) {

                    StringBuilder result = new StringBuilder();

                    // Add characters before i
                    result.append(target.substring(0, i));

                    // Add a character greater than target[i]
                    result.append((char) ('a' + c));

                    freq[c]--;

                    // Add remaining characters in sorted order
                    for (int j = 0; j < 26; j++) {
                        while (freq[j] > 0) {
                            result.append((char) ('a' + j));
                            freq[j]--;
                        }
                    }

                    return result.toString();
                }
            }
        }

        return "";
    }
}