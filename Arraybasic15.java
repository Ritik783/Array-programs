public class Arraybasic15 {
    public static int sumofarray(int arr_1[], int arr_2[],int n,int m){
        int result[] = new int [n];
        int i= n-1,  j=m-1,k=n-1;
        int carry=0;
        int sum=0;
        while( j>=0){
            sum = arr_1[i]+ arr_2[j]+carry;
            result[k] =(sum%10);
            carry= sum/10;
            i--;
            j--;
            k--;     
        }
        while(i>=0){
            sum = arr_1[i]+ carry;
            result[k]= (sum%10);
            carry = sum/10;
            i--;
            k--;
        }
        int ans=0;
        if(carry==1){
            ans=10;
        }
        for(int h=0; h<=n-1; h++){
            ans +=result[h];
            ans *= 10;
        }
        return ans/10;
    }
    public static void main(String[] args) {
        int arr_1[] = {1,2,3,4};
        int arr_2[] = {7,8};
        int n= arr_1.length;
        int m= arr_2.length;
        System.out.println(sumofarray(arr_1 ,arr_2,n,m));
    }
}
