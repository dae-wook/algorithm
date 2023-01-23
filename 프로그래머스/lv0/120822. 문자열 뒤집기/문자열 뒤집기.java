
class Solution {
    public String solution(String my_string) {
        char[] cArr = my_string.toCharArray();
        char[] cArr2 = my_string.toCharArray();
        int length = cArr.length - 1;
        for(int i = 0; i < cArr.length; i++, length--) {
            cArr[length] = cArr2[i];
            
        }
        return new String(cArr);
    }
}