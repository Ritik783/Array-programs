import java.util.*;
public class ArrayBasic5 {
    public static int binarysearch(int arr[],int key){
        int start=0, end = arr.length;
         while(start<=end){
            int mid= (start+end)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,5,6,8,9,45};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key value");
        int key = sc.nextInt();
        int index =binarysearch(arr, key);
        System.out.println("index for key is:" + index);
        
    }
    
}
