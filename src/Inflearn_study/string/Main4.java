package Inflearn_study.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

    public List<String> solution(List<String> list){
        List<String> result = new ArrayList<>();
        for(String str : list){
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.reverse();
            result.add(sb.toString());
        }

        return result;
    }

    public static void main(String[] args){
           Main4 m = new Main4();
           Scanner in =new Scanner(System.in);
           int cnt = in.nextInt();
           List<String> list = new ArrayList<>();
           for(int i = 0 ; i < cnt ; i ++){
               list.add(in.next());
           }

        for(String str : m.solution(list)){
            System.out.println(str);
        }
    }
}
