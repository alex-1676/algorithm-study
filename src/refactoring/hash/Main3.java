package refactoring.hash;
import java.io.*;
import java.util.*;

public class Main3 {
    public String solution (int[] arr1 , int[] arr2) {
        int size = arr1[0];
        int range = arr1[1];

        StringBuilder sb = new StringBuilder();

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < size - range + 1 ; i++) {
            for(int j = i ; j < i + range ; j++) {
                set.add(arr2[j]);
            }
            sb.append(set.size()).append(" ");
            set.clear();
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) throws Exception {
        Main3 m = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(m.solution(arr1 , arr2));
    }
}
