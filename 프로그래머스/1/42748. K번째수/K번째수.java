import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            List<Integer> split = new ArrayList<>();
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                split.add(array[j]);
            }
            Collections.sort(split);
            answer[i] = split.get(commands[i][2] - 1);
        }
        
        return answer;
    }
}