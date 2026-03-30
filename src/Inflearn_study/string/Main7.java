package Inflearn_study.string;

import java.util.*;

public class Main7 {

    public String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        if(sb.equals(sb.reverse())) {
            return "YES" ;
        }else {
            return "NO" ;
        }
    }
    public static void main(String[] args) {
        Main7 m = new Main7();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(m.solution(str));
    }
}
