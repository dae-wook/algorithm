import java.util.*;
public class Main {
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int input = sc.nextInt();
        int change = 1000 - input;

        while(change > 0) {
            if(change >= 500) {
                change -= 500;
                answer++;
            }else if(change >= 100) {
                change -= 100;
                answer++;
            }else if(change >= 50) {
                change -= 50;
                answer++;
            }else if(change >= 10) {
                change -= 10;
                answer++;
            }else if(change >= 5) {
                change -= 5;
                answer++;
            }else {
                change -= 1;
                answer++;
            }
        }

        System.out.println(answer);

    }
}
