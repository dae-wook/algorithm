import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);
        for(int i = 1; i < words.length; i++) {
            char lastLetter = words[i - 1].charAt(words[i - 1].length() - 1);
            if(wordSet.contains(words[i]) || words[i].charAt(0) != lastLetter) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            wordSet.add(words[i]);
        }
        return answer;
    }
}