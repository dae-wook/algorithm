class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        answer = java.util.Arrays.copyOfRange(numbers, num1, num2 + 1);
        
        
        return answer;
    }
}