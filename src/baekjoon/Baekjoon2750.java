package baekjoon;

import java.util.Scanner;

public class Baekjoon2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[scan.nextInt()];
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1])
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
