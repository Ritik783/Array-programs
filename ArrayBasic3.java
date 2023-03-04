import java.util.Scanner;

public class ArrayBasic3 {
    public static int linearsearch(int arr[],int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,5,6,8,9,45,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key value");
        int key = sc.nextInt();
        int index = linearsearch(arr, key);

        if(index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("element index:" + index);
        }
        
    }
}
