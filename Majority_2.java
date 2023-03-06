public class Majority_2 {
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        int count = 0;
        int ele = 0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(count == 0){
                ele = arr[i];
            }
            if(ele == arr[i]){
                count +=1;
            }
            else{
                count -=1;
            }
        }
        System.out.println("majority element is::" + ele);
    }
}
