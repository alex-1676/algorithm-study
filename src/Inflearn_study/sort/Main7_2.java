package Inflearn_study.sort;


import java.util.*;
import java.io.*;
public class Main7_2 {
    public String[] solution (int size , int[][] arr) {
        Arrays.sort(arr,(a,b) -> {
            if(a[0] > b[0]) {
                return Integer.compare(a[0], b[0]);
            }else if(a[0] == b[0]){
                return Integer.compare(a[1], b[1]);
            }
            return -1;
            /**
             * sort 안에 if(a[0] > b[0]) 이게 중복느낌이다 그러니
             * if( a[0] == b[0]) {
             *  return Integer.compare(a[1] , b[1])
             * }
             * return Integer.compare(a[0],b[0])
             */
        });
        String[] result = new String[size];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < 2 ; j++){
                sb.append(arr[i][j]).append(" ");
            }
            result[i] = sb.toString().trim();
            sb.setLength(0);
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        Main7_2 m = new Main7_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[][] arr = new int[size][2];

        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] =  Integer.parseInt(st.nextToken());
            arr[i][1] =  Integer.parseInt(st.nextToken());
        }
        String[] result = m.solution(size , arr);
        for(String s : result){
            System.out.println(s);
        }
    }
}
