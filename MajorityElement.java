import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,1,5,3,1,1,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        Set<Integer> s =map.keySet();
        for (Integer key : s) {
            if(map.get(key) > arr.length/2){
                System.out.println("The majority element are =>"+key);
            }
        }
    }
}
