public class Arraybasic13 {
    public static void arrayrotated(int arr[],int s){
        int n= arr.length;
        for(int i = 1; i<n; i++){
            arr[i-1]= arr[i];
            System.out.print(arr[i]+ " ");

        }
        arr[n-1] = s;
        System.out.println(arr[n-1]);
    }
    public static void main(String[] args) {
        int arr[]= {3,5,1,7,5,6};
        int s=arr[0];
        arrayrotated(arr, s);

    }
}
