class Solution {
    public String makeGood(String s) {
        int n = s.length();
        if(n == 1)  return s;
        
        StringBuilder result = new StringBuilder();

        for( char ch : s.toCharArray() ) {
            int temp = result.length();

            if( temp > 0 && ( ch + 32 == result.charAt( temp - 1 ) || ch - 32 == result.charAt( temp - 1 ) ) ) {
                result.deleteCharAt( temp - 1 );
            }
            else{
                result.append( ch );
            }

        }
        return result.toString();
    }
}