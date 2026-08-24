package refactoring.math;
import java.io.*;
import java.util.*;

public class Main5 {
    public int solution(int num) {
        int result = 0;

        for(int i = 2; i <= num ; i++) {
            boolean isPrime = false;
            for(int j = 2; j * j <= i ; j++) {
                if(i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if(!isPrime) result++;
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
