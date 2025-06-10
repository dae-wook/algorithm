class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        for(String input : keyinput) {
            if(input.equals("left")) {
                answer[0]--;
                if(answer[0] < board[0] / 2 * -1) {
                    answer[0]++;
                }
            }
            if(input.equals("right")) {
                answer[0]++;
                if(answer[0] > board[0] / 2) {
                    answer[0]--;
                }
            }
            if(input.equals("up")) {
                answer[1]++;
                if(answer[1] > board[1] / 2) {
                    answer[1]--;
                }
            }
            if(input.equals("down")) {
                answer[1]--;
                if(answer[1] < board[1] / 2 * -1) {
                    answer[1]++;
                }
            }
        }
        
        return answer;
    }
}