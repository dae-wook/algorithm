class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int small = a > b ? b : a;
        int big = a > b ? a : b;
        for(int i = small; i <= big; i++) {
            answer += i;
        }
        return answer;
    }
}