class Solution {
    public int solution(int num, int k) {
        
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        if(sb.indexOf(k + "") == -1) return -1;
        return sb.indexOf(k + "") + 1;
    }
}