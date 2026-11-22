class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        List<Integer> result=new ArrayList<>();
        int arr[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            arr[ch-'a']=i;
        }

        int i=0;
        while(i<n){
            char ch=s.charAt(i);
            int end=arr[ch-'a'];

            int j=i;
            while(j<end){
                end=Math.max(end,arr[s.charAt(j)-'a']);
                j++;
            }
            result.add(j-i+1);
            i=j+1;
        }
        return result;
    }
}