class Solution {
    public int solution(int n) {
        int a = 0, b = 1;
		for(int i = 1; i <= n; i++) {
		    int next = (a + b) % 1234567;
		    a = b;
		    b = next;
		}
        
        return a % 1234567;
    }
}