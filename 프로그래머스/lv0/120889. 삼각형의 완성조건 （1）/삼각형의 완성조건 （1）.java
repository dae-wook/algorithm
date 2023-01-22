import java.util.Arrays;

class Solution {
    public static int solution(int[] sides) {

        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;

    }
}