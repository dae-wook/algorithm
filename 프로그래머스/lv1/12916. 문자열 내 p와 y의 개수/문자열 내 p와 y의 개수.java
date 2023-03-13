class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int py = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') py++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') py--;
        }
        
        answer = py==0?true:false;

        return answer;
    }
}