import java.util.*;
public class ArrayBasic4 {
    public static int getlasgest1(int arr[]){
        int  largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];

            }

        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,9,2};
        int rr = getlasgest1(arr);
        System.out.println("Largest number is :" + rr); 
    }
    
}
