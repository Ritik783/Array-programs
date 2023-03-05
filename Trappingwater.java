public class Trappingwater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        int n= arr.length;
        int prefix_min[] = new int [n]; 
        prefix_min[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix_min[i] = Math.max(prefix_min[i-1], arr[i]);
        }
        int suff_min[] = new int[n];
        suff_min[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suff_min[i] = Math.max(suff_min[i+1], arr[i]);
        }
        int  total=0;
        for(int i=0; i<n; i++){
        int curr=arr[i];
        int min = Math.min(prefix_min[i],suff_min[i]);
        if(min>curr){
            total += min-curr;
        }
    }
        System.out.println("total height of water:"+ total);
}

}