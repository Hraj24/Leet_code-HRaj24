class Solution {
    public int maximum69Number (int num) {
        int pv=0;
        int pvSix=-1;
        int temp=num;
        while(temp>0){
            if(temp%10==6){
                pvSix=pv;
            }
            temp/=10;
            pv++;
        }
        if(pvSix==-1){
            return num;
        }
        return num+(3*(int)Math.pow(10,pvSix));
    }
}