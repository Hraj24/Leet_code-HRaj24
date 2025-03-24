class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<>();

        int cnt=0;
        for(int i=left;i<=right;i++){
            int n=i;
            while(n>0){
                int num=n%10;
                if(num==0 || i%num!=0){
                    cnt++;
                    break;
                }
                n/=10;
            }
            if(cnt==0){
                res.add(i);
            }else{
                cnt=0;
            }
        }
        return res;
    }
}