package Inflearn_study.string;

import java.util.Scanner;

public class Main2 {

    public String solution(String str){
        char[]ch = str.toCharArray();
        for( int i = 0 ; i < ch.length ; i++ ){
            if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            }else {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        return new String(ch);
    }
    public static void main(String[] args){
        Main2 m = new Main2();
        Scanner in  = new Scanner(System.in);
        String str = in.next();
        System.out.println(m.solution(str));
    }
}
