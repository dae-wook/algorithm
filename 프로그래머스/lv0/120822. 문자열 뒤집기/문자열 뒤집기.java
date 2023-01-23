
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] cArr = my_string.toCharArray();
        for(int i = cArr.length - 1; i >= 0; i--) {
            answer += cArr[i];
            
        }
        return answer;
    }
}