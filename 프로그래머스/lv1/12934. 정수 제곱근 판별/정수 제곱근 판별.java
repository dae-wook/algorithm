class Solution {
    public long solution(long n) {
        long answer = 0;
        answer = Math.sqrt(n) == Math.ceil(Math.sqrt(n)) ? (long)Math.sqrt(n) : -1;
        if(answer != -1) {
            return (answer+1) * (answer+1);
        }
        return answer;
    }
}