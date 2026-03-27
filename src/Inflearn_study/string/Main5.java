package Inflearn_study.string;

import java.util.*;
public class Main5 {

    public String solution(String str){
        int start = 0;
        int end = str.length()-1;
        char[] ch = str.toCharArray();
        while(start < end){
            if(Character.isAlphabetic(ch[start])){
               while(start < end){
                   if(Character.isAlphabetic(ch[end])){
                        char temp = ch[start];
                        ch[start] = ch[end];
                        ch[end] = temp;
                        end --;
                        break;
                   }
                   end--;
               }
            }
            start++;
        }
        return new String(ch);
    }

    public static void main(String[] args){
        Main5 m = new Main5();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(m.solution(str));
    }
}
