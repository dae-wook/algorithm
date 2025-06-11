import java.util.*;
class Solution {
    public int[] solution(int n) {
        int prime = 2;
        Set<Integer> set = new LinkedHashSet<>();
        while(prime <= n) {
            
            if(n % prime == 0) {
                set.add(prime);
                n /= prime;
            }else {
                prime++;
            }
            
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}