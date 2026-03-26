package Inflearn_study.string;

import java.util.Scanner;

public class Main1 {

    public int solution(String str, Character searchChar){
        int result = 0;
        String small = str.toLowerCase();
        char target = Character.toLowerCase(searchChar);
        for(char c : small.toCharArray()){
            if(Character.toLowerCase(searchChar) == c){
                result++;
            }
        }
        return result;
    }

   public static void main(String[] args){
       Main1 m = new Main1();
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       char searchChar = sc.next().charAt(0);
       System.out.println(m.solution(str , searchChar));
   }
}
