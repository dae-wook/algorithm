import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        
        Collections.sort(list, Collections.reverseOrder());
        int count = 0;
        
        for(int i = 0; i < list.size(); i++) {
            if(count + list.get(i) >= k) {
                answer= i + 1;
                break;
            }
            count += list.get(i);
        }
        
        return answer;
    }
}