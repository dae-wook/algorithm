class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCount = countBits(n);
        while (answer < n) {
            if(nCount == countBits(n + 1)) {
                answer = n + 1;
            }else {
                n++;
            }
        }
        return answer;
    }
    
    public int countBits(int num) {
        int oneCount = 0;
        while(num >= 1) {
            if(num % 2 == 1) oneCount++;
            num /= 2;
        }
        return oneCount;
    }
}