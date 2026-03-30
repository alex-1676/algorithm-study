package Inflearn_study.string;

import java.util.*;

public class Main10 {

    public List<Integer> solution(String str1, String str2) {
        char standard = str2.charAt(0);
       char[] ch = str1.toCharArray();
       List<Integer> leftToRight = new ArrayList<>();
       List<Integer> rightToLeft = new ArrayList<>();

       boolean flag = false;
       int cnt = 0;
       for(int i = 0 ; i < ch.length ; i++) {
            if(!flag && standard!= ch[i]) {
                leftToRight.add(100);
            }else if(standard == ch[i]) {
                flag = true;
                cnt = 0;
                leftToRight.add(cnt);
            }else if(flag && standard != ch[i]) {
                cnt++;
                leftToRight.add(cnt);
            }
       }
        flag = false;
        cnt = 0;
        for(int i = ch.length - 1 ; i >= 0 ; i--) {
            if(!flag && standard!= ch [i]) {
                rightToLeft.add(100);
            }else if(standard == ch[i]) {
                flag = true;
                cnt = 0;
                rightToLeft.add(cnt);
            }else if(flag && standard != ch[i]) {
                cnt++;
                rightToLeft.add(cnt);
            }
        }
        int left = 0;
        Collections.reverse(rightToLeft);
        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < leftToRight.size() ; i++) {
            int minNum = Math.min(leftToRight.get(i), rightToLeft.get(i));
            result.add(minNum);
        }

        return result;
    }
    public static void main(String[] args) {
        Main10 m = new Main10();
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        List<Integer> result = m.solution(str1, str2);
        for(int n : result) {
            System.out.print(n + " ");
        }
    }
}
