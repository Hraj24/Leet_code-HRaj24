class Solution {
    public String reversePrefix(String word, char ch) {
        //Using Stack
        //Stack<Character> originalWord=new Stack<>();



        //Using String Method
        int idx = word.indexOf(ch);
        if (idx == -1) return word;

        StringBuilder sb = new StringBuilder(word.substring(0, idx + 1));
        sb.reverse().append(word.substring(idx + 1));
        return sb.toString();

    }
}