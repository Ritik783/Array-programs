// package ARRAYS;

import java.util.Scanner;

public class MatrixAdd {
    public static void Sum(int arr[][]){
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum +=arr[i][j]; 
            }
            System.out.println(sum);
        }
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
        System.out.println("The matrix are the:....");
         int sum2 = 0;
         int sum3 = 0;
        for(int i=0; i<arr.length; i++){
            int sum1 = 0;
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
                sum1 +=arr[i][j];
                if(i == j){
                    sum2 +=arr[i][j];
                }
                if((i+j) == arr.length-1){
                    sum3 +=arr[i][j];
                }
            }
            System.out.println("=>"+sum1);
            System.out.println();
        }
        System.out.println("First diagonal sum is:="+sum2);
        System.out.println("The second diagonal sum is:="+sum3);
        sc.close();
        // Sum(arr);
        
    }
}
