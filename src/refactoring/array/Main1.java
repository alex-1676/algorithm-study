package refactoring.array;
import java.io.*;
import java.util.*;
public class Main1 {
    static int[] arr;
    static int[] arr2;
    public String solution() {
        int[]arr3 = new int[arr.length + arr2.length];
        for(int i = 0 ; i < arr.length ; i++) {
            arr3[i] = arr[i];
        }
        for(int i = 0 ; i < arr2.length ; i++) {
            arr3[arr.length + i] = arr2[i];
        }
        Arrays.sort(arr3);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr3.length ; i++) {
            sb.append(arr3[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws Exception{
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size1 = Integer.parseInt(br.readLine());
        arr = new int[size1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < size1 ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int size2 = Integer.parseInt(br.readLine());
        arr2 = new int[size2];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < size2 ; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
        System.out.println(m.solution());
    }
}
