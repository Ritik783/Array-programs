public class LCMofArray {
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static int hcf(int arr[]){
        int hcf = gcd(arr[0], arr[1]);
        for(int i=2; i<arr.length; i++){
            hcf = gcd(hcf, arr[i]);
            if(hcf == 1){
                break;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        int arr[] = {4,8,16,32} ;
        System.out.println("The hcf is the:=>"+hcf(arr));
        int lcm = arr[0];
        for(int i=1; i<arr.length; i++){
            int c=lcm;
            // int d= arr[i];
            int g_val = gcd(c, arr[i]);
            lcm = (lcm*arr[i])/g_val;
        }
        System.out.println("Lcm of the array:=>"+lcm);
    }
}
