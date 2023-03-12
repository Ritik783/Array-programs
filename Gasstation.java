public class Gasstation {
    public static void main(String[] args) {
        int gas[] = {2,3,4};
        int cost[]= {3,4,3};
        int rem =0;
        int loss=0;
        int n= gas.length;
        for(int i=0; i<n; i++){
            rem +=gas[i]- cost[i];
            if(rem<0){
                System.out.println(rem);
               i = i+1;
                loss = rem;
                rem = 0;
            }
            
         }  
         System.out.println(rem);
            
         
        }
    }
    

