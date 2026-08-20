package refactoring.string;

import java.io.*;

public class Main2 {

    public String solution (String str) {
        char[] ch = str.toCharArray();

        for(int i = 0 ; i < ch.length ; i++) {
            if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            }else {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        return new String(ch);
    }
    public static void main(String[] args)throws Exception {
        Main2 m = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(m.solution(str));
    }
}
