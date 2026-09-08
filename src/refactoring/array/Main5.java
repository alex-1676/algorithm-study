package refactoring.array;
import java.io.*;
import java.util.*;

public class Main5 {
    public int solution (int num) {
        int result = 0;

        int index = 1;
        int sum = 0;
        for(int i = 1 ; i < num ; i++) {
            sum += i;
            if(sum == num)result++;

            if(sum > num) {

                while(sum > num) {
                    sum -= index++;
                    if(sum == num) {
                        result++;
                        break;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        Main5 m = new Main5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(m.solution(num));
    }
}
