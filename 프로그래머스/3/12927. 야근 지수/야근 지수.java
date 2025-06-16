import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int work : works) {
            if(work > 0) maxHeap.offer(work);
        }
        
        while(n > 0 && !maxHeap.isEmpty()) {
            int work = maxHeap.poll() - 1;
            n--;
            if(work > 0) maxHeap.offer(work);
        }
        
        while(!maxHeap.isEmpty()) {
            int num = maxHeap.poll();
            answer += (long)num * num;
        }
        
        return answer;
    }
}