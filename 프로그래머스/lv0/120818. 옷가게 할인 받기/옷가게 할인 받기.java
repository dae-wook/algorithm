class Solution {
    public int solution(int price) {
        double answer = price;

        if(price < 100000) {
            answer = price;
        }else if(price < 300000) {
            answer -= answer / 100 * 5;
        }else if (price < 500000) {
            answer -= answer / 100 * 10;
        }else {
            answer -= answer / 100 * 20;
        }

        return (int) Math.floor(answer);
    }
}