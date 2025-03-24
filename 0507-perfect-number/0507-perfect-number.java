class Solution {
    public boolean checkPerfectNumber(int num) {
        int total=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                total+=i;
            }
        }
        
        return (total==num)?true:false;




        //return (num==6 || num==28 || num==496 || num==8128 || num==33550336)? true : false;
    }
}