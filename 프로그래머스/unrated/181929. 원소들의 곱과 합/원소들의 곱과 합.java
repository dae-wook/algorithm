class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = num_list[0];
        int b = 0;
        for(int i = 0; i < num_list.length; i++) {
            a *= i > 0 ? num_list[i] : 1;
            b += num_list[i];
        }
        answer = a < b * b ? 1 : 0;
        return answer;
    }
}