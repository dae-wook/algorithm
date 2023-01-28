class Solution {
    public int solution(int num) {
        if(num == 1) return 0;
        long l = num;
        int answer = 0;
        while(l != 1) {
            l = l % 2 == 0 ? l / 2 : l * 3 + 1;
            answer++;
            if(answer >= 500) {
                return -1;
            }
        }
        return answer;
    }
}