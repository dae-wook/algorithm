import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] strArr = (n + "").split("");
        Integer[] intArr = new Integer[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(intArr, Collections.reverseOrder());
        String s = Arrays.toString(intArr).replace("[","").replace("]","").replace(",","").replace(" ", "");

        return Long.parseLong(s);
    }
}