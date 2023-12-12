public class CommonElement {
    public static void main(String[] args) {
        int s1[] = {3,4,15,20,30,70,80,120};
        int s3[] = {6,7,20,80,100};
        int s2[] = {1,5,10,20,40,80};
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
                if(s1[i] == s2[j]){
                    for(int k=0; k<s3.length; k++){
                        if(s2[j] == s3[k]){
                            System.out.print(s3[k]+" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
