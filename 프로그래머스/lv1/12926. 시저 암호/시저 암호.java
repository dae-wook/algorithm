class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // s = "ABCDEFGHIJKLMNOPQRSTUVWSYZ";
        // s = "abcdefghijklmnopqrstuvwxyz";
        // n = 25;
        for(char c : s.toCharArray()) {
            if(c <= 'z' && c >= 'a') {
                if(c + n > 'z') {
                    answer += (char)(c + n - 26);
                }else {
                    answer += (char)(c + n);
                }
            }else if(c <= 'Z' && c >= 'A' ){
                if(c + n > 'Z') {
                    answer += (char)(c + n - 26);
                }else {
                    answer += (char)(c + n);
                }
            }else {
                answer += ' ';
            }
        }
        return answer;
    }
}