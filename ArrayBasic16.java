import java.util.HashMap;

public class ArrayBasic16 {
    public static void oddelement(int arr[], int key){
        int  n=arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i]== key){
                System.out.println(arr[i]);
            }
            System.out.println();
        }
    }
    public static void oddelement(int arr[]){
        int hash[] = new int[100];
        int n = hash.length-1;
        for(int i=0 ; i<n; i++){
            hash[arr[i]]= ++hash[arr[i]];
        }
        for(int i=0;i<hash.length;i++){
            if(hash[i]== 1){
                System.out.println("element is:"+ i);
                break;
            }
        }
    }
    //using X_OR
    
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        int key = 4;
        oddelement(arr,key);
    }
}
