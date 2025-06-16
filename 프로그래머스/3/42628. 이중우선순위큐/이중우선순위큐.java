import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(String s : operations) {
            String[] operation = s.split(" ");
            
            if(operation[0].equals("I")) {
                int num = Integer.parseInt(operation[1]);
                map.put(num, map.getOrDefault(num, 0) + 1);
                
            } else if(!map.isEmpty()) {
                if(operation[1].equals("1")) {
                    int lastKey = map.lastKey();
                    if(map.get(lastKey) == 1) map.remove(lastKey);
                    else map.put(lastKey, map.get(lastKey) - 1);
                    
                } else {
                    int firstKey = map.firstKey();
                    if(map.get(firstKey) == 1) map.remove(firstKey);
                    else map.put(firstKey, map.get(firstKey) - 1);
                    
                }
            }
        }
        
        int max = map.isEmpty() ? 0 : map.lastKey();
        int min = map.isEmpty() ? 0 : map.firstKey();
        
        return new int[] {max, min};
    }
}