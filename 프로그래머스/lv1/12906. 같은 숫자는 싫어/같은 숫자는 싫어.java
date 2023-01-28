import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int c = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(c);
        for (int num : arr) {
            if (num == c) {
                continue;
            }else{
                c = num;
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}