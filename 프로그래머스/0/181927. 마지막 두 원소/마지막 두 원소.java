class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int last = answer[answer.length - 2];
        int penu = answer[answer.length - 3];
        
        if(last > penu) {
            answer[answer.length - 1] = last - penu;
        } else {
            answer[answer.length - 1] = last * 2;
        }
        
        
        return answer;
    }
}