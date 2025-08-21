class Solution {
    public double myPow(double x, int n) {
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


         if (n == 0)
        { 
            return 1;
        }
        
        double half = myPow(x, n / 2);

        if (n % 2 == 0) 
        {
            return half * half;
        }
        if (n < 0) 
        {
            return half * half / x;
        
        }
        
        return half * half * x;
    }
}