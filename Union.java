// package ARRAYS;

import java.util.Arrays;

public class Union {
    public static void Print(int x[], int y[]){
        Arrays.sort(x);
        Arrays.sort(y);
        int i=0; 
        int j=0;
        int k=0;
        int temp[] = new int[x.length+y.length-2];
        while(i<x.length && j<y.length){
            if(x[i]<y[j]){
                temp[k] = x[i];
                i++;
            }
            else if(x[i]>y[j]){
                temp[k] = y[j];
                j++;
            }
            else{
                temp[k] = y[j++];
                i++;
            }
            k++;
        }          
        while(i<x.length){
            temp[k++] = x[i++];
        }
        while(j<y.length){
            temp[k++] = y[j++];
        }
        for(i=0; i<temp.length; i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        int x[] = {1,3,5,7};
        int y[] = {1,3,2,6,9};
        Print(x, y);
    }
}
