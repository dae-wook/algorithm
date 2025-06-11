class Solution {
    public int solution(int[] numbers, int k) {
        int answer = numbers[0];
        
        for(int i = 0; i < k - 1; i++) {
            for(int j = 0; j < 2; j++) {
                answer ++;
                if(answer > numbers.length) {
                    answer = numbers[0];
                }
            }
        }
        
        return answer;
    }
}