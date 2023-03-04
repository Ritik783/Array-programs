public class Arraybasic9 {
    public static int getmax(int arr[]){
    int max=0;
    for(int i=0; i<arr.length; i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    return max;
}
    public static void main(String[] args) {
        int arr[] = {2,1,3,5,0,7};
        System.out.println(getmax(arr));

    }
    
}
