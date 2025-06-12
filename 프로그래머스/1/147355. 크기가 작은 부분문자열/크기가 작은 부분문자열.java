class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i = 0; i <= t.length() - p.length(); i++) {
            String number = "";
            
            for(int j = i; j < p.length() + i; j++) {
                number += t.charAt(j);
            }
            if(Long.parseLong(number) <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}