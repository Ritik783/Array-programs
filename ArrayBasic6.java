public class ArrayBasic6 {
    public static void reversearray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
         
        start++;
        end--;
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,3,5,6,8,9,45};
        reversearray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    
}
