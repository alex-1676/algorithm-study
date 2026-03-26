package Inflearn_study.string;

import java.util.Scanner;

public class Main3  {

    public String solution(String str){
        String[] arr = str.split(" ");
        String temp = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i].length() > temp.length()){
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args){
        Main3 m = new Main3();
        Scanner in = new Scanner(System.in);


        String str = in.nextLine();
        System.out.println(m.solution(str));
    }
}
