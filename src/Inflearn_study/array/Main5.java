package Inflearn_study.array;
import java.util.*;

public class Main5 {
    public int solution (int n) {
        int standard = 0;
        int result = 0;
        int lt = 1;
        int rt = 1;

        while(rt <= n) {
            if(standard > n) {
                standard = standard - lt;
                lt++;
            }else if(standard == n) {
                result++;
                standard = standard - lt;
                lt++;
            }else {
                standard = standard + rt;
                rt++;
            }
        }
        return result;
    }
    public static void main ( String[] args) {
        Main5 m = new Main5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(m.solution(n));
    }
}
