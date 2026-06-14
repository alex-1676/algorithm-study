package Inflearn_study.bfs;

import java.util.*;
import java.io.*;

public class Main1 {

    public int solution(int now, int destination) {
        int cnt = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[100001];
        dq.push(now);
        visited[now] = true;
        while (!dq.isEmpty()) {
            int size = dq.size();
            cnt++;
            for (int i = 0; i < size; i++) {
                int n = dq.pollFirst();

                List<Integer> list = new ArrayList<>();
                list.add(n - 1);
                list.add(n + 1);
                list.add(n + 5);
                for (int j : list) {
                    if (visited[j]) continue;
                    visited[j] = true;
                    if (j == destination) return cnt;
                    dq.offerLast(j);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws Exception {
        Main1 m = new Main1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hyun = Integer.parseInt(st.nextToken());
        int song = Integer.parseInt(st.nextToken());
        System.out.println(m.solution(hyun, song));
    }
}
