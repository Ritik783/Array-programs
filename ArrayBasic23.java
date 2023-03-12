public class ArrayBasic23 {
    public static void lowest(int arr[] , int search){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i] == search){
                System.out.print(arr[i-1] + " "+ arr[i+1]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,15,20,25,40,45,50,55,58,70};
        int search=55;
        lowest(arr, search);
    }
}
