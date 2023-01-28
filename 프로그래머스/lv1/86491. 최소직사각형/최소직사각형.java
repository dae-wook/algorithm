import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] big = new int[sizes.length];
        int[] small = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                big[i] = sizes[i][0];
                small[i] = sizes[i][1];
            }else {
                big[i] = sizes[i][1];
                small[i] = sizes[i][0];
            }
        }
        Arrays.sort(big);
        Arrays.sort(small);
        return big[big.length-1] * small[big.length-1];
    }
}

// 10 12 15 14 15
// 7  3  8  7  5

//6 7 6 8
//5 3 3 4

//14 19 16 18 11
//4  6  6  7  7