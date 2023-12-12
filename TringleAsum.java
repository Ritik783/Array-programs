// package ARRAYS;

import java.util.Scanner;

public class TringleAsum {
    public static void TringleSum(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                sum +=arr[i][j];
            }
        }
        System.out.println("The upper Tringle sum is:=>"+sum);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the row");
        int n = sc.nextInt();
        System.out.println("Enter the size of the each row");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        TringleSum(arr);
    }
}
