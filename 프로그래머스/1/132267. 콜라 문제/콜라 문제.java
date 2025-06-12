class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bottle = 0;
        while(n >= a) {
            answer += n / a * b;
            bottle = n % a;
            n = n / a * b;
            n += bottle;
            
        }
        
        return answer;
    }
}