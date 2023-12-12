

public class SwapArrayByIndex {
    public static void Print(int arr[]){
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            arr[temp] = i;
            i = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,0};
        int c[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            c[i] = arr[i];
        }
        Print(arr);
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == c[i]){
                count = count+1;
            }
        }
        if(count == arr.length){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
