import java.util.*;
class Solution {
    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            };
        }
        int[] answer = new int[set.size()];
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while(iterator.hasNext()) {
            answer[i] = iterator.next();
            i++;
        }
        // Arrays.sort(answer);
        return answer;
    }
}