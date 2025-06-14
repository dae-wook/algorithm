import java.util.*;

public class Solution {
    public int solution(int n) {
        int remain = 0;
        
        while (n >= 1) {
            remain += n % 2;
            n /= 2;
        }
        
        
        return remain;
    }
}