public class SumSubsets {
    public static int sum(int arr[]){
         int res = 1;
        for(int i=0; i<arr.length; i++){
            if(res< arr[i]){
                return res;
            }else{
                res = res+arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,6,10,11,15};
        System.out.println(sum(arr));
       
    }
}
