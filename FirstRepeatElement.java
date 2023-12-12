

public class FirstRepeatElement {
    public static void main(String[] args) {
        int arr[] = {10,5,3,4,3,5,6};
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count = count+1;
                }
            }
            if(count >=2){
                    System.out.println(arr[i]);
                    break;
                }
        }
    }
}
