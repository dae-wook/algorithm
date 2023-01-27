import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
                cnt++;
            }
        }
        int[] answer = new int[list.size()];
        if(cnt == 0){
            return new int[]{-1};
        }else{
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}