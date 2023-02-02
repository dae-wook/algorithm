import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] firstSupo = {1, 2, 3, 4, 5};
        int[] secondSupo = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdSupo = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == firstSupo[i % firstSupo.length]) score[0]++;
            if(answers[i] == secondSupo[i % secondSupo.length]) score[1]++;
            if(answers[i] == thirdSupo[i % thirdSupo.length]) score[2]++;
        }
        
        int max = 0;
        for(int i = 0; i < score.length; i++) {
            if(max < score[i]) max = score[i];
        }
        
        ArrayList<Integer> list = new ArrayList();
        
        if(score[0] == max) list.add(1);
        if(score[1] == max) list.add(2);
        if(score[2] == max) list.add(3);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}