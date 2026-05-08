package Inflearn_study.array;

import java.util.*;
public class Main1_2 {

    public String solution (String first , String second) {
            StringBuilder sb = new StringBuilder();
            sb.append(first);
            sb.append(" ");
            sb.append(second);
            String[] sumStr = sb.toString().split(" ");
            sb.setLength(0);
            int[] result = new int[sumStr.length];

            for(int i = 0 ; i < sumStr.length ; i++) {
                result[i] = Integer.parseInt(sumStr[i]);
            }
            Arrays.sort(result);

            for(int i = 0 ; i < result.length ; i++) {
                sb.append(result[i]);
                sb.append(" ");
            }

            return sb.toString();

    }

    public static void main (String[] args) {
        Main1_2 m = new Main1_2();
        Scanner in = new Scanner (System.in);

        int size1 = in.nextInt();
        in.nextLine();
        String first = in.nextLine();
        int size2 = in.nextInt();
        in.nextLine();
        String second = in.nextLine();

        int size = size1 + size2;

        System.out.println(m.solution(first , second));
    }
}
