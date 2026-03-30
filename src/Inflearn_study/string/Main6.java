package Inflearn_study.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6 {

    public String solution(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : set) {
            sb.append(ch);
        }
        return new String(sb);
    }
    public static void main(String[] args) {
        Main6 m = new Main6();

        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(m.solution(str));
    }
}
