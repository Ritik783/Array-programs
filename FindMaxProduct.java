public class FindMaxProduct {
    public static void main(String[] args) {
        int arr[] = {2,5,-2,6,-3,8,0,7,-9,4};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-2; i++){
            int s = arr[i]*arr[i+1]*arr[i+2];
            max = Math.max(max, s);
        }
        System.out.println("Maximum product of the three number are:=>"+max);
    }
}
