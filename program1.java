package reverse;


import java.util.Scanner;


public class program1

{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		

		String a=sc.next();

	

	   char c[]=a.toCharArray();

	   int left=0;

	   int right=c.length-1;

	   char temp;

	   while(left<right)

	   {

		 if(left%2==0||right%2==0)  

		 {

		   temp =c[left];

		   c[left]=c[right];

		   c[right]=temp;

		   }

		   left++;

		   right--;

		 }

	   System.out.println(c);

	   

		

	}



}

