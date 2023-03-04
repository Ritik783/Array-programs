public class Arraybasic18 {
    public static void counttwo(int arr[],int key){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                c++;
                System.out.print(i + " ");
            }
        }
        System.out.println("count is:" + c);
        
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key= 2;
        counttwo(arr, key);
    }
}