package Inflearn_study.string;

import java.util.Scanner;
public class Main12 {

    public String solution(String str , int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++) {
            String sub = str.substring(i*7 , i*7+7);
            String change = sub.replace("#","1").replace("*","0");
            char num10 = (char) Integer.parseInt(change,2);
            sb.append(num10);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Main12 m = new Main12();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        System.out.println(m.solution(str, n));
    }
}
