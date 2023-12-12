import java.util.Arrays;

public class Shift {
    static void print(int arr[]){
        Arrays.sort(arr);
        int bp = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                bp = i-1;
                break;
            }
        }
        int j=0;
        while(j<=bp){
            int temp = arr[j];
            arr[j] = arr[bp];
            arr[bp] = temp;
            j++;
            bp--;
        }
    }
    public static void main(String s[]){
        int arr[] = {-1,2,-3,-4,-8,6};
        print(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
