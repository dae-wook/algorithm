class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);

        int[] answer = new int[str.length()];
        int count = str.length();
        for(int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(count - 1) - '0';
            count--;
        }

        return answer;
    }
}