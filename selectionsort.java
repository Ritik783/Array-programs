package threding.SORTING;
public class selectionsort {
    static void select(int arr[],int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            int min = i;
            for(int j=i+1 ; j<n ; j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int r = arr[i];
            arr[i] = arr[min];
            arr[min] = r;
        }
    }
    public static void main(String[] args)   
     {
        int array[] = {10,21,-11,-20,15,19,-30};
        int n = array.length;
        select(array,n);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(array[i] + ",");
        } 
    }
}
