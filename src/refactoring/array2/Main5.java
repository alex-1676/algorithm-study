package refactoring.array2;
import java.io.*;
import java.util.*;

public class Main5 {
    public String solution (int size , int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int a  : arr) {
            if(!set.add(a)) {
                return "D";
            }
        }

       return "U";
    }
    public static void main(String[] args) throws Exception{
        Main5 m = new Main5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(size , arr));
    }
}
