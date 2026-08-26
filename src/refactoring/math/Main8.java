package refactoring.math;

import java.io.*;
import java.util.*;

public class Main8 {
    public String solution(int size, String str) {
        Integer[] arr = Arrays.stream(str.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] sorted = arr.clone();
        Arrays.sort(sorted, Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], i + 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < size ; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }
        return sb.toString().trim();

    }

    public static void main(String[] args) throws Exception {
        Main8 m = new Main8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(m.solution(size, str));
    }
}
