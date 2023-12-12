public class SequenceDiagonalTraverse {
    public static void main(String[] args) {
    int arr[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int n = arr.length;
    int m=arr[0].length;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("After the traverse of the array.......");
    for(int i=0; i<n+m-1; i++){
        //logic
        for(int j=0; j<n; j++){
            for(int k=0; k<m; k++){
                if(j+k == i){
                if(i%2!=0){
                System.out.print(arr[j][k]+" ");
                }
                else{
                    System.out.print(arr[k][j]+" ");
                }
            }
            }
        }
        System.out.println();
    }
}
}

