public class Arraybasic11 {
    public static void lastselement(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>max){
                max= arr[i];
                System.out.print( arr[i] +" ");
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,9,7,4};
        lastselement(arr);
    }
    
}
