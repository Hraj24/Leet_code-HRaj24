class Solution {
    public int findClosest(int x, int y, int z) {
       int zx = Math.abs(z - x);
       int zy = Math.abs(z - y);
        if (zx == zy){
            return 0;
        }
        if (zx < zy){
            return 1;
        }
        return 2;
    }
}