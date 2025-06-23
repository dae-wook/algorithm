import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Map<String,Integer> wordMap = new HashMap<>();
        wordMap.put(words[0], 1);
        for(int i = 1; i < words.length; i++) {
            char lastLetter = words[i - 1].charAt(words[i - 1].length() - 1);
            if(wordMap.get(words[i]) != null || words[i].charAt(0) != lastLetter) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            wordMap.put(words[i], 1);
        }
        return answer;
    }
}