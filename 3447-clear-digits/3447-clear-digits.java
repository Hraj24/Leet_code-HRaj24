class Solution {
    public String clearDigits(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char v = s.charAt(i);
            if (!s1.isEmpty() && v >= '0' && v <= '9') {
                s1.pop();
            } else if (!(i == 0 && v >= '0' && v <= '9')) {
                s1.push(v);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!s1.isEmpty()) {
            result.insert(0, s1.pop());
        }

        return result.toString();
    }
}