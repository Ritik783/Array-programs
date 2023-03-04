import java.util.*;
public class ArrayBasic7 {
    public static void printpair(int arr[]){
        for(int i=0; i<arr.length; i++){
            int crr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + crr +","+ arr[j]+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[]= new int[n];

        System.out.println("enter the element");
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
       // int arr[]= {2,3,5,6,8,9,45};
        printpair(arr);
    }
}
