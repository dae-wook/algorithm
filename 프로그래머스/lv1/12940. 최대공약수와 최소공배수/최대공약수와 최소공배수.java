class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int g;
        if(m % n == 0) {
            answer[1] = m;
            answer[0] = n;
        }else {
            for(int i = n / 2; i > 0; i--) {
                if (n % i == 0 && m % i == 0) {
                    answer[0] = i;
                    break;
                }
            }
            answer[1] = (n / answer[0]) * (m / answer[0]) * answer[0];
        }
        return answer;
    }
}