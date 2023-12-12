public class FindAllZero {
    public static void FindZero(int m,int n,int arr[][],int row,int col){
        if(row>=0 && row<n && col>=0 && col<m){
            if(arr[row][col] == 0){
                return; // base case//
            }
            arr[row][col] = 0;
            FindZero(m, n, arr, row, col-1);
            FindZero(m, n, arr, row, col+1);
            FindZero(m, n, arr, row-1, col);
            FindZero(m, n, arr, row+1, col);
        }  
    }
public static void Print(int n, int m, int arr[][], int k){
    for (int i= 0; i< n; i++) {
        for (int j=0; j<m; j++) {
            if (k == arr[i][j]) {
                FindZero(m, n, arr, i, j);
            }
        }
    }
}
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,5},
            {4,5,6,7},
            {7,8,0,9}
        };
        int n= arr.length;
        int m = arr[0].length;
        int k=4;
        Print(n, m, arr, k);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
