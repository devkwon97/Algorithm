package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10870 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        System.out.println(fibo(input));
    }

    public static int fibo(int num){
        if (num == 0){
            return 0;
        }else if(num == 1 ){
            return 1;
        }else{
            return fibo(num-2) + fibo(num-1);
        }
    }
}