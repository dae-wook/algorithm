import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strNumbers = s.split(" ");
        int[] numbers = new int[strNumbers.length];
        
        for(int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        
        
        return min + " " + max;
    }
}