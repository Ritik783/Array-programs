public class ArrayBasic19 {
    public static boolean printpair(int arr[],int target){     //rotated & sorted print pair  
        int n=arr.length-1; 
        int bp = -1;          //bp =breakpoint
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                bp= i;
                break;
            }
        }
        int lp = bp+1;         //lp=leftpointer        
        int rp = bp;                  //rp=rightpointer
        while(lp != rp){
            if(arr[lp]+arr[rp] == target){
                return true;
            }
            if(arr[lp]+arr[rp] < target){
                lp= (lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {11,15,6,8,9,10};
        int target = 14;
        System.out.println(printpair(arr, target));
    }
}
