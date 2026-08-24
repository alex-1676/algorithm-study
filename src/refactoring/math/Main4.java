package refactoring.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4 {

    static int[] arr;
    public String solution(int size) {
        arr = new int[size];
        StringBuilder sb = new StringBuilder();

        arr[0] = 1;
        arr[1] = 1;
        sb.append(arr[0]).append(" ").append(arr[1]).append(" ");
        for(int i = 2 ; i < size ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws Exception{
        Main4 m = new Main4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        System.out.println(m.solution(size));
    }
}
