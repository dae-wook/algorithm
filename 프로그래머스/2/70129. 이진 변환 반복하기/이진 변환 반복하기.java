class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        while (!s.equals("1")) {
            int zeroCount = 0;
            for(char c : s.toCharArray()) {
                if(c == '0') zeroCount++;
            }
            answer[1] += zeroCount;
            
            int oneCount = s.length() - zeroCount;
            StringBuilder sb = new StringBuilder();
            while(oneCount >= 1) {
                sb.append(oneCount % 2);
                oneCount /= 2;
            }
            s = sb.reverse().toString();
            answer[0]++;
        }
        
        return answer;
    }
}