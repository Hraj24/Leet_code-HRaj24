class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalChalk=0;
        for(int i:chalk){
            totalChalk+=i;
        }

        long remaining =(k%totalChalk);

        for(int j=0;j<chalk.length;j++){
            if(remaining<chalk[j]){
                return j;
            }
            remaining-=chalk[j];
        }

        return 0;
    }
}