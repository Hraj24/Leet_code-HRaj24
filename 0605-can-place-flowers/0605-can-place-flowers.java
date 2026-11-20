class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num=flowerbed.length;
        for (int i = 0; i < num && n > 0; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == num-1 || flowerbed[i+1] == 0)) {
                i++;
                n--;
            }
        }
        return n == 0;
    }
}