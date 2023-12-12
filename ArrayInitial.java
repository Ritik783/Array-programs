

import java.util.Scanner;

class ArrayInitial{
    public static void main(String[] args) {
        int max[];
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        max = new int[n];
        System.out.println("Insert the values in the arrays");
        for(int i=0; i<=max.length-1; i++){
            max[i] = sc.nextInt();
        }
        System.out.println("The array .......");
        for(int i=0; i<max.length; i++){
            System.out.print(max[i]+" ");
        }
        sc.close();
    }
    
}
