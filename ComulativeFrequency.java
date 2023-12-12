import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class ComulativeFrequency {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4};
        //Task 1//
        Arrays.sort(arr);
        System.out.println("...The sorted Array is...");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Task 2//
        System.out.println(".....comulative frequency.....");
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
         }
        Set<Integer> s = map.keySet();
        int com = 0;
        for (Integer key : s) {
            com = com+map.get(key);
            System.out.println(com);
            
        }
    }
}
