import java.util.*;
public class condition {
public static void main(String[] args) {
int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       
        for(i=1;i<=n;i++)
        {
            for(int s=i;s<=n;s++)
            {
                System.out.print( " ");
            }
            for(j=1;j<=i;j++)
            {              
                System.out.print(j+ "  ");
               
            }System.out.println();      
   
        }
         for(i=n-1;i>=1;i--)
        {
            for(int s=i;s<=n;s++)
            {
                System.out.print( " ");
            }
            for(j=1;j<=i;j++)
            {              
                System.out.print(j+ "  ");
               
            }System.out.println();      
   
        }
}


}

