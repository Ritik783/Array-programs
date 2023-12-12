

public class FinalArrays {
    public static void main(String[] args) {
      final int arr[] = {1,2,3,4,5,6};
       System.out.println(arr[0]);
    //    int y[] = {100, 202, 300};
    //    arr = y;
    arr[0] = 1000;
    System.out.println(arr[0]);
    }
}
