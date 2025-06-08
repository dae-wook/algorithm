class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        
        char char1 = sb.charAt(num1);
        char char2 = sb.charAt(num2);
        
        sb.insert(num1, char2);
        sb.deleteCharAt(num1 + 1);
        
        sb.insert(num2, char1);
        sb.deleteCharAt(num2 + 1);
        
        return sb.toString();
    }
}