class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int MIN = arrays.get(0).get(0);
        int MAX = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            maxDistance = Math.max(maxDistance, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - MIN));
            maxDistance = Math.max(maxDistance, Math.abs(MAX- arrays.get(i).get(0)));
            MIN = Math.min(MIN, arrays.get(i).get(0));
            MAX = Math.max(MAX, arrays.get(i).get(arrays.get(i).size() - 1));
        }

        return maxDistance;
    }
}