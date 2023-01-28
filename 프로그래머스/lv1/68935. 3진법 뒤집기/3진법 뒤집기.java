class Solution {
    public int solution(int n) {
        String str = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder().append(str);
        return Integer.parseInt(sb.reverse().toString(), 3);
    }
}