package Inflearn_study.math;
import java.util.*;

public class Main12 {

    public int solution (int row , int column , String[] rank) {
        int[][] ranks = new int[row][column];
        for(int i = 0 ; i < row ; i++) {
            String[] str = rank[i].split(" ");
            for(int j = 0 ; j < column ; j++) {
                ranks[i][j] =Integer.parseInt(str[j]);
            }
        }
        int result = 0;
        boolean resultFlag = false;
        for(int i = 0 ; i < column - 1 ; i++) {
            int mento = ranks[0][i];
            for(int j = i + 1 ; j < column ; j++) {
                int menti = ranks[0][j];
//                resultFlag = false;
                boolean flag = false;
                for(int k = 1 ; k < row ; k++) {
                    if(flag){
                        break;
                    }
                    for(int l = 0 ; l < column ; l++) {
                        if(ranks[k][l] == menti) {
                            resultFlag = false;
                            flag = true;
                            break;
                        }
                        if(ranks[k][l] == mento) {
                            resultFlag = true;
                            break;
                        }
                    }
                }
                if(resultFlag) {
                    result++;

                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Main12 m = new Main12();
        Scanner in = new Scanner(System.in);
        String size = in.nextLine();
        String[] sizeString = size.split(" ");
        int column = Integer.parseInt(sizeString[0]);
        int row = Integer.parseInt(sizeString[1]);

        String[] rank = new String[row];

        for(int i = 0 ; i < row ; i++) {
            rank[i] = in.nextLine();
        }

        System.out.println(m.solution(row , column , rank));
    }
}
