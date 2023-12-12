// package ARRAYS;

public class TringleBmax {
    public static void TringleMax(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The lower tringle maximum value are the:=>"+max);
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,30,15}
                       };
        TringleMax(arr);
    }
}
