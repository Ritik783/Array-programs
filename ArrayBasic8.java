public class ArrayBasic8 {
    public static void printsubarray(int arr[]){
        int totalsub=0;
        int sum =0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=0; j<arr.length; j++){
                int end = j;
                sum=0;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                   // sum = sum+arr[k];
                    //System.out.print( sum);
                }
                 //totalsub++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("totalsub is equalto:"+ totalsub);
    }
    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printsubarray(arr);

    }
}
