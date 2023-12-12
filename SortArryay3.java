import java.util.HashSet;

public class SortArryay3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        String arr1[] = {"g","e","e","k","s","f","o","r","g","e","e","k","s"};
        int arr2[] = {0,1,1,0,1,2,2,0,1};
        String temp[] = new String[arr2.length];
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        // System.out.println(set);
        int l=0;
        for (int k : set) {
            for(int j=0; j<arr2.length; j++){
                if(k == arr2[j]){
                    temp[l] = arr1[j];
                    l++;
                }
            } 
        }
        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    } 
}
