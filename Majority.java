import java.util.Scanner;

public class Majority {
    public static void array(int arr[],int key){
        int n= arr.length;
        int count = 0;
        for(int i=0;i<n; i++){
            if(arr[i]== key){
                count +=1;
            }
        }
            if(count > n/2){
                System.out.println( "majority exist:" +  key);
            }
            else{
                System.out.println("majority not exist");
            }
        }
    
    public static void main(String[] args) {
         int arr[]  = {2,2,1,1,1,2,2};
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the key element:");
    int key = sc.nextInt();
    array(arr, key);
    }
}
