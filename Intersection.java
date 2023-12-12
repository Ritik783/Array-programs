// package ARRAYS;

import java.util.Arrays;

class Intersection {
    public static void Print(int x[], int y[]){
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=0; i<x.length; i++){
            for(int j=0; j<y.length; j++){
                if(x[i] == y[j]){
                    System.out.print(x[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int x[] = {1,2,3,4};
        int y[] = {2,4,6,8};
        Print(x, y);
    }
}
