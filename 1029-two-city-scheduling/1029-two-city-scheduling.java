class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        int n = costs.length;
        List<Integer> diffA = new ArrayList<>(); 
        List<Integer> diffB = new ArrayList<>(); 

        for (int[] c : costs) {
            if (c[0] < c[1]) {
                sum += c[0];
                diffA.add(c[1] - c[0]);
            } else {
                sum += c[1];
                diffB.add(c[0] - c[1]);
            }
        }
        if (diffA.size() > n / 2) {
            Collections.sort(diffA);
            int extra = diffA.size() - (n / 2);
            for (int i = 0; i < extra; i++) {
                sum += diffA.get(i);
            }
        }else if (diffB.size() > n / 2) {
            Collections.sort(diffB);
            int extra = diffB.size() - (n / 2);
            for (int i = 0; i < extra; i++) {
                sum += diffB.get(i);
            }
        }

        return sum;
    }
}