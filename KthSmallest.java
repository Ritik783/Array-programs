import java.util.Arrays;;

public class KthSmallest {
    public static void main(String[] args) {
        int arr[] = {7,10,4,3,20,15};
        int k=5;
        Arrays.sort(arr);
        if(k<arr.length){
        System.out.println("The smallest element is:=>"+arr[k-1]);
        }else{
            System.out.println("Not found the element");
        }
    }
}
