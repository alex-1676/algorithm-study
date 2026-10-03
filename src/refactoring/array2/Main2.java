package refactoring.array2;
import java.io.*;
import java.util.*;
public class Main2 {

    public String solution (int size , int[] arr) {

        for(int i = 0 ; i < size - 1 ; i++) {
            for(int j = 0; j < size - 1 - i ; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int a : arr) {
            sb.append(a).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws Exception{
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(size , arr));
    }
}
