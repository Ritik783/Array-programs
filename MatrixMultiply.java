// package ARRAYS;

public class MatrixMultiply {
    public static void multiply(int a[][], int b[][]){
        int c[][] = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                for(int k=0; k<b[i].length; k++){
                c[i][j] =c[i][j]+ a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("....The multiply of the mtrix are....");
        System.out.println();
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][] = {
                    {1,1,1},
                    {1,1,1},
                    {1,1,1}
                    };
        int b[][] = {
                    {1,1,2},
                    {1,1,2},
                    {1,1,2}
                    };
        multiply(a, b);
    }
}
