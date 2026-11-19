package refactoring.greedy;

import java.io.*;
import java.util.*;

public class Main6 {
    static Map<Integer, List<Integer>> map;
    static boolean[] visited;

    public String bfs(int fr1, int fr2) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(fr1);
        visited[fr1] = true;

        while (!deque.isEmpty()) {
            int num = deque.pollFirst();
            if (num == fr2) return "YES";

            List<Integer> list = map.get(num);
            for (int i : list) {
                if (!visited[i]) {
                    deque.offerLast(i);
                    visited[i] = true;
                }
            }
            visited[num] = true;
        }
        return "NO";
    }

    public static void main(String[] args) throws Exception {
        Main6 m = new Main6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int stNum = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        map = new HashMap<>();
        visited = new boolean[stNum + 1];

        for (int i = 0; i < size; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            map.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            map.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int friend1 = Integer.parseInt(st3.nextToken());
        int friend2 = Integer.parseInt(st3.nextToken());

        String result = m.bfs(friend1, friend2);
        System.out.println(result);
    }
}
