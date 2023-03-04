public class Arraybasic22 {
    public static void binarysort(int arr[],int n){
    boolean R;
        for( int i=0 ; i<n ; i++){
            R=false;
            for(int j=0 ; j<n-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int r = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = r;
                    R=true;
                }
            }
            if(R == false){
                break;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,1,0,0,0,1,1};
        int n= arr.length;
        binarysort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}
