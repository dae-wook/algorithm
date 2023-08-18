class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        return a % 2 != 0 && b % 2 != 0 ? a * a + b * b : (a % 2 == 0 && b % 2 == 0) ? a - b < 0 ? (a - b) * -1 : a - b : 2 * (a + b);
    }
}