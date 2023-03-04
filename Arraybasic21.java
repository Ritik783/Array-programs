public class Arraybasic21 {
    public static void runningSum(int arr[]){
        int n=arr.length;
        int s=arr[0];
        System.out.print(s+ " ");
        for(int i=0;i<n-1; i++){
            s= s+arr[i+1];
            System.out.print(s + " " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,10,1};
        runningSum(arr);
    }
}
