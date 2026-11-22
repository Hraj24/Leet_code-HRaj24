class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0){
            return tasks.length;
        }
        int []arr=new int[26];
        for(int i=0;i<tasks.length;i++){
            char ch=tasks[i];
            arr[ch-'A']++;
        }
        Arrays.sort(arr);

        int maxFreq=arr[25];
        int blankSpaces=maxFreq-1;
        int idlePlaces=blankSpaces*n;

        for(int i=24;i>=0;i--){
            idlePlaces-=Math.min(arr[i],blankSpaces);
        }

        if(idlePlaces>0){
            return tasks.length+idlePlaces;
        }

        return tasks.length;
    }
}