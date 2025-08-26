class Solution {
    public double myPow(double x, int n) {

        //////Bit Manipulation Method

        // if(n < 0){
        //     n = -n;
        //     x = 1 / x;
        // }
        
        // double pow = 1;
        
        // while(n != 0){
        //     if((n & 1) != 0){
        //         pow *= x;
        //     } 
                
        //     x *= x;
        //     n >>>= 1;
            
        // }
        
        // return pow;




        ////// Recursion Method

    //     if (n == 0)
    //     { 
    //         return 1;
    //     }
        
    //     double half = myPow(x, n / 2);

    //     if (n % 2 == 0) 
    //     {
    //         return half * half;
    //     }
    //     if (n < 0) 
    //     {
    //         return half * half / x;
        
    //     }
        
    //     return half * half * x;




    ////// Loop Method
        double ans = 1.0;
        long nn = n;
        if (nn < 0){
            nn = -1 * nn;
        }
        while (nn > 0) {
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0){
            ans = (double)(1.0) / (double)(ans);
        } 
        return ans;

    }
}