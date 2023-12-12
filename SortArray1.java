// package ARRAYS;

import java.util.Scanner;

class SortArray1 {
    public static void sort1(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                for(int k=0; k<arr.length; k++){
                    for(int l=0; l<arr[k].length; l++){
                        if(arr[i][j]>arr[k][l]){
                            int temp  = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
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
        sort1(arr);
    }
}
