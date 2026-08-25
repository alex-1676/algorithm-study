package refactoring.math;
import java.io.*;
import java.util.*;

public class Main7 {
    public int solution(int size , String str) {
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        int score = 0;

        for(int i = 0 ; i < size ; i++) {
            if(arr[i] == 1){
                result += ++score;
            }else {
                score = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {
        Main7 m = new Main7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(m.solution(size , str));
    }
}
