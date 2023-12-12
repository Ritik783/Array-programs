package ARRAYS;
import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int arr[] = {49,1,3,200,2,4,70,5};
        Arrays.sort(arr);
        int s = arr[0];
        int Count = 1;
        System.out.print(s+" ");
        for(int i=1; i<arr.length; i++){
            if(arr[i] == s+1){
                s = arr[i];
                Count = Count+1;
                System.out.print(s+" ");
            }
        }
        System.out.println();
        System.out.println("The length is:=>"+Count);
    }
}
