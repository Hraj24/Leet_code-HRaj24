class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        int min=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                min+=1;
                max+=1;
            }else if(s.charAt(i)==')'){
                min-=1;
                max-=1;
            }else{
                min-=1;
                max+=1;
            }

            if(min<0){
                min=0;
            }
            if(max<0){
                return false;
            }
        }
        return (min == 0);
    }
    // public boolean parenthesisCheck(int index,int count,String s){
    //     if(count<0){
    //         return false;
    //     }
    //     int n=s.length();
    //     if(index==n){
    //         return (count==0);
    //     }
    //     if(s.charAt(index)=='('){
    //         return parenthesisCheck(index+1,count+1,s);
    //     }
    //     if(s.charAt(index)==')'){
    //         return parenthesisCheck(index+1,count-1,s);
    //     }
    //     return parenthesisCheck(index+1,count+1,s) || parenthesisCheck(index+1,count-1,s) || parenthesisCheck(index+1,count,s);
    //}
}