import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class CountFrequency {
    public static void Print(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        Set<Entry<Integer, Integer>> set = map.entrySet();
        for (Entry<Integer, Integer> f : set) {
            System.out.println(f.getKey()+"->"+ f.getValue()+"  ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,3,3,3,4,4,4,5};
        Print(arr);
    }
}
