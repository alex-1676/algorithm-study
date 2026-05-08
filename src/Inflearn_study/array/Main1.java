package Inflearn_study.array;

import java.util.*;

public class Main1 {

    public int[] solution (String firstAry , String secondAry) {

        String joinStr = firstAry + " " + secondAry;
        String[] strArray = joinStr.split(" ");
        int[] result = new int[strArray.length];
        for(int i = 0 ; i < strArray.length ; i++) {
            result[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(result);

        return result;
    }
    public static void main(String[] args) {
        Main1 m = new Main1();
        Scanner in = new Scanner(System.in);
        int size1 = in.nextInt();
        in.nextLine();
        String firstAry = in.nextLine();
        int size2 = in.nextInt();
        in.nextLine();
        String secondAry = in.nextLine();

        int[] result = m.solution(firstAry,secondAry);

        for(int i = 0 ; i < size1 + size2 ; i++) {
            System.out.print(result[i]);
        }
    }
}
