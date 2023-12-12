// import java.util.Arrays;

class RepaeteTwice{
    public static void main(String[] args) {
        int arr[] ={1,2,2,3,3,4,4,5,5};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=1; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]+" ");
                }
            }
        }

    }
}

