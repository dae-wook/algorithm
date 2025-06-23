class Solution {
    public long solution(int n) {
        
        long left = 0;
        long right = 1;
        long next = 0;
        
        for(int i = 1; i <= n; i++) {
            next = (left + right) % 1234567;
            left = right;
            right = next;
        }
        
        return next;
    }
}