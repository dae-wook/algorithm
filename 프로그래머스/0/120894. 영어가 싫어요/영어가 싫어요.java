class Solution {
    public long solution(String numbers) {
        String answer = "";
        String[] engNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String number = "";
        for(int i = 0; i < numbers.length(); i++) {
            number += numbers.charAt(i);
            for(int j = 0; j < engNum.length; j++) {
                if(number.equals(engNum[j])) {
                    answer += j;
                    number = "";
                }
            }
        }
        
        return Long.parseLong(answer);
    }
}