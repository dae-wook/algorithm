class Solution {
    public StringBuilder solution(String n_str) {
        StringBuilder answer = new StringBuilder(n_str);
        
        for(char c : answer.toString().toCharArray()) {
            if(c == '0') answer.delete(0, 1);
            else break;
        }
        
        return answer;
    }
}