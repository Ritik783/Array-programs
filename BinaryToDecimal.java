public class BinaryToDecimal {
    public static void Print(int arr[]){
        int dec = 0;
        int pow = 0;
        for(int i=arr.length-1; i>=0; i--){
            dec = dec+arr[i]*(int)Math.pow(2, pow);
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0};
        Print(arr);
    }
}
