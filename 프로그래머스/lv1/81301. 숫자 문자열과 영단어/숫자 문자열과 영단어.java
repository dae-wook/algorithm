import java.util.*;
class Solution {
    public int solution(String s) {
        String str = new String(s);
        HashMap<String,Integer> map = new HashMap();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while(iter.hasNext()) {
            String key = iter.next();
           while(str.contains(key)) {
               str = str.replace(key, map.get(key).toString());
           }
        }
        return Integer.parseInt(str);
    }
}