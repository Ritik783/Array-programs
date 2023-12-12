import java.util.Arrays;

public class UniqueNumber {
    public static int Print(int arr[]){
        int x  =0;
        for(int i=0; i<arr.length; i++){
            x = x^arr[i];
        }
        return x;
    }
    public static void main(String[] args) {
        int arr[] ={23,34,56,21,21,56,78,23,34};
        Arrays.sort(arr);
        System.out.println("The unique element are the:=>"+Print(arr));
    }
}
