package refactoring.math;
import java.io.*;
import java.util.Arrays;

public class Main3 {
    public String solution (int size , String strA, String strB) {
        int[] arrA = Arrays.stream(strA.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrB  = Arrays.stream(strB.split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < size ; i++) {
            int diff = arrA[i] - arrB[i];
            if(arrA[i] == arrB[i]) {
                sb.append("D").append("\n");
                continue;
            }

            if(diff == 1 | diff == -2) {
                sb.append("A").append("\n");
            }else {
                sb.append("B").append("\n");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws Exception{
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String strA = br.readLine();
        String strB = br.readLine();
        System.out.println(m.solution(size , strA , strB));
    }
}
