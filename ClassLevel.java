// package ARRAYS;

import java.util.Scanner;

public class ClassLevel {
    int z[];
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ClassLevel l1 = new ClassLevel();
        l1.z = new int[n];
        for(int i=0; i<l1.z.length; i++){
            l1.z[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<l1.z.length; i++){
            System.out.print(l1.z[i]+" ");
        }
        System.out.println();
    }
}
