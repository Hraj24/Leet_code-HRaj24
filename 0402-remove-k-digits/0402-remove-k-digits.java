class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder result = new StringBuilder();
        int n = num.length();

        for (int i = 0; i < n; i++) {
            char curr = num.charAt(i);

            while (result.length() > 0 && result.charAt(result.length() - 1) > curr && k > 0) {
                result.deleteCharAt(result.length() - 1);
                k--;
            }
            if (result.length() > 0 || curr != '0') {
                result.append(curr);
            }
        }
        while (result.length() > 0 && k > 0) {
            result.deleteCharAt(result.length() - 1);
            k--;
        }

        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }
}