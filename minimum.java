import java.util.*;
public class minimum {
    public static void main(String[] args) 
    {
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
            int a[]= {3,2,5,1,6,7};
            for(int i=0;i<a.length;i++)
            {
                if(max<a[i])
                {
                    max=a[i];
                }
                else if(min>a[i]){
                    min=a[i];
                }
            }
            System.out.println(max);
            System.out.println(min);
        int span = max-min;
        System.out.println(span);
    }
}
