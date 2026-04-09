package Inflearn_study.math;

import java.util.Scanner;

public class Main7 {

    public int solution(int cnt , String oxOrigin) {
        String[] oxChange = oxOrigin.split(" ");
        int score = 0;
        int result = 0;

        for(int i = 0 ; i < cnt ; i++) {
            if(!oxChange[i].equals("0")) {
                score++;
            }else {
                score = 0;
            }
            result += score;
        }
        return result;
    }
    public static void main (String[] args) {
        Main7 m = new Main7();
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        in.nextLine();
        String ox_Origin = in.nextLine();
        System.out.println(m.solution(cnt , ox_Origin));
    }
}
