import java.util.*;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < a.length; i++) {
            minHeap.offer(a[i]);
            maxHeap.offer(b[i]);
        }
        
        while(!minHeap.isEmpty()) {
            answer += minHeap.poll() * maxHeap.poll();
        }

        return answer;
    }
}