class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length > 10) {
            for (int num : num_list) {
                answer += num;
            }
        } else {
            for (int i = 0 ; i < num_list.length; i++) {
                if(i == 0) {
                    answer = num_list[0];
                } else {
                    answer = answer * num_list[i];
                }
            }
        }
        return answer;
    }
}