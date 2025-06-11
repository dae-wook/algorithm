class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() % n > 0 ? my_str.length() / n + 1 : my_str.length() / n];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = "";
            for(int j = i * n; answer[i].length() < n ; j++) {
                if(j >= my_str.length()) {
                    break;
                }
                answer[i] += my_str.charAt(j);
            }
        }
        
        return answer;
    }
}