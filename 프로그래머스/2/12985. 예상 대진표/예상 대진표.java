class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        while(a != b) {
            a = getGroup(a);
            b = getGroup(b);
            answer++;
        }

        return answer;
    }
    
    int getGroup(int participant) {
        return (participant - 1) / 2 + 1;
    }
}