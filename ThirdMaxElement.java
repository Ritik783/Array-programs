

public class ThirdMaxElement {
    public static void Print(int arr[]){
     int first = arr[0];
     int second= Integer.MIN_VALUE;
     int third = Integer.MIN_VALUE;
     for(int i=1; i<arr.length; i++){
        if(arr[i]>first){
            third = second;
            second = first;
            first = arr[i];
        }else if(arr[i]>second){
            third = second;
            second = arr[i];
        }else if(arr[i]>third){
            third = arr[i];
        }
     }
     System.out.println(third);
}
    public static void main(String[] args) {
       int arr[] = {9,1,4,3,2,6,13};
    //    int k =3;
    //    Arrays.sort(arr);
       Print(arr);
    //    System.out.println("Third maximum number is=>"+arr[arr.length-k]);
       
    }
}
