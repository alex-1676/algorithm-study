package Inflearn_study.string;

import java.util.Scanner;

public class Main9 {

    public int solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        Main9 m  = new Main9();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(m.solution(str));
    }
}
