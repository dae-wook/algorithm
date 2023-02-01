import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int combo = 0;
        String[] ox = new String[sc.nextInt()];

        for (int i = 0; i < ox.length; i++) {
            ox[i] = sc.next();
        }

        for (int i = 0; i < ox.length; i++) {
            for(int j = 0; j < ox[i].length(); j++) {
                if(ox[i].charAt(j) == 'O') {
                    score += 1 + combo;
                    combo++;
                }else {
                    combo = 0;
                }
            }
            System.out.println(score);
            score = 0;
            combo = 0;
        }


    }


}