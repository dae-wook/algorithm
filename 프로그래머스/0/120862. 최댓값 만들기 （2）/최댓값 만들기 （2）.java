class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i == j) continue;
                
                int multi = numbers[i] * numbers[j];
                if(answer <= multi) {
                    answer = multi;
                }
            }
        }
        
        return answer;
    }
}