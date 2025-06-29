class Solution {
    public StringBuilder solution(String myString) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : myString.toCharArray()) {
            if(c == 'a') {
                answer.append('A');   
            } else if(c >= 'B' &&  c <= 'Z') {
                answer.append((char)(c + 32));
            } else {
                answer.append(c);
            }
            
        }
        
        return answer;
    }
}