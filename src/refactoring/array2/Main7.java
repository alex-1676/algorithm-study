package refactoring.array2;
import java.io.*;
import java.util.*;

public class Main7 {
    static int[][] arr;

    public List<String> solution(int size) {
        for(int i = 0 ; i < size-1 ; i++) {
            for(int j = 0 ; j < size - i-1 ; j++) {
                if(arr[j][0] > arr[j+1][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else if(arr[j][0] == arr[j+1][0]) {
                    if(arr[j][1] > arr[j+1][1]) {
                        int temp = arr[j][1];
                        arr[j][1] = arr[j+1][1];
                        arr[j+1][1] = temp;
                    }
                }
            }
        }
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < size ; i++) {
            list.add(arr[i][0] + " " + arr[i][1]);
        }
        return list;
    }
    public static void main(String[] args) throws Exception{
        Main7 m = new Main7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        arr = new int[size][size];

        for(int i = 0 ; i < size ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            arr[i][0] = first;
            arr[i][1] = second;
        }

        List<String> list = m.solution(size);
        for(String s : list) {
            System.out.println(s);
        }
    }
}
