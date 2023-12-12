// package ARRAYS;

class TwoOperation {
    public static int count(int arr[]){
        int n = arr.length;
        int result = 0;
        while (true){
            int zeroCount = 0;
            int i;
            //Base case
            for (i=0; i<n; i++){
                if (arr[i] % 2 == 1)
                break;
                else if (arr[i] == 0)
                zeroCount++;
            }
            if (zeroCount == n)
            return result;
            //Divide the element of the array
            if (i == n){
                for (int j=0; j<n; j++)
				    arr[j] = arr[j]/2;
				    result++;
			    }
			for (int j=i; j<n; j++){
                if (arr[j] %2 == 1){
                    arr[j]--;
                    result++;
                }
            }       
        }
    }
public static void main(String[] args) {
    int arr[] = {100};
System.out.println("Number of steps are the get the target array:=>"+count(arr));
	
	}               
}

