class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for(char c : String.valueOf(order).toCharArray()) {
            int num = (int)c - 48;
            if(num % 3 == 0 && num != 0) answer++;
        }
        
        return answer;
    }
}