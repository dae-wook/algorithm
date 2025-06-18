import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int num : scoville) {
            minHeap.offer(num);
        }
        
        while(minHeap.peek() < K) {
            int a, b, mix;
            
            if(minHeap.size() > 1) {
                a = minHeap.poll();
                b = minHeap.poll();
            }else {
                return -1;
            }
            
            mix = a + b * 2;
            minHeap.offer(mix);  
            
            answer++;
        }
        
        return answer;
    }
}