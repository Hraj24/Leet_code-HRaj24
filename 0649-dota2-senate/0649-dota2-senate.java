import java.util.*;

class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radQueue.offer(i);
            } else {
                direQueue.offer(i);
            }
        }
        while (!radQueue.isEmpty() && !direQueue.isEmpty()) {
            int radIdx = radQueue.poll();
            int direIdx = direQueue.poll();

            if (radIdx < direIdx) {
                radQueue.offer(radIdx + n);
            } else {
                direQueue.offer(direIdx + n);
            }
        }

        return radQueue.isEmpty() ? "Dire" : "Radiant";
    }
}