// package ARRAYS;

public class TringleBmin {
    public static void Tringlemin(int arr[][]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The lower tringle minimum value are the:=>"+min);
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
                       };
        Tringlemin(arr);
    }
}
