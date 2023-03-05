public class ArrayusingXor{
    public static void X_or(int arr[]){
        int x=0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            x=x^arr[i];
        }
        System.out.println("Odd element is:" + x );
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        X_or(arr);
    }
}
