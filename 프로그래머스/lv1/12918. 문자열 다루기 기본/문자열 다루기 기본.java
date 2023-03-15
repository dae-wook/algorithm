class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for(char c : s.toCharArray()) {
            if(c >= 'A' && c <= 'z' ) {
                return false;
            }else if ((s.length() != 4 && s.length() != 6)) {
                return false;
            }
        }
        return answer;
    }
}