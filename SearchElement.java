public class SearchElement {
    public static int SearchEle(int arr[],int target){
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid] == target){
                return 1;
            }
            if(arr[mid]<target){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        int target =2;
        System.out.println(SearchEle(arr, target));
    }
}
