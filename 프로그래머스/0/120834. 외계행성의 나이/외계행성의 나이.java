class Solution {
    public String solution(int age) {
        String ageString = String.valueOf(age);
        StringBuilder answer = new StringBuilder();
        //+97
        for(char c : ageString.toCharArray()) {
            answer.append((char)((int)c + 49));
        }
        return answer.toString();
    }
}