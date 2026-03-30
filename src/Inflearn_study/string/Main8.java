package Inflearn_study.string;

import java.util.*;
public class Main8 {

    public String solution(String str) {

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < chars.length ; i++) {
            if(Character.isAlphabetic(chars[i])) {
                sb.append(chars[i]);
            }
        }
        String before = sb.toString().toLowerCase();
        String after = sb.reverse().toString().toLowerCase();
        if(before.equals(after)) {
            return "YES";
        }else {

            return "NO";
        }
    }

    public static void main(String[] args) {
        Main8 m = new Main8();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(m.solution(str));
    }
}
