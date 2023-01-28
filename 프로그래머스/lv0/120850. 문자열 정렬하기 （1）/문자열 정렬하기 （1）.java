class Solution {
    public int[] solution(String my_string) {
        String[] strArr = my_string.replaceAll("[a-z]", "").split("");
        int[] answer = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        java.util.Arrays.sort(answer);
        return answer;
    }
}