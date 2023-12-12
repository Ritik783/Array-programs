// package ARRAYS;

import java.util.Scanner;

class Max1 {
    public static int MaxValue(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of the row");
        int n = sc.nextInt();
        System.out.println("Enter the number of the Each row size");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(MaxValue(arr));

        sc.close();
        System.out.println(Integer.MIN_VALUE);
    }
}
