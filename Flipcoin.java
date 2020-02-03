import java.util.*;
public class Flipcoin
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Number of Times Flip: ");
       int n=sc.nextInt();
         
       int head=0;
       int tail=0;
       int count=0;
       
         int n2=2,n1=1; 
         for(int i=1;i<=n;i++)
         {
	      n1=n1*2;	
         }
      System.out.println("Number of Combinations: "+n1);
       
       while(n1!=0)
       { 

         if((Math.random())<0.5)
   	  {
             tail++;
             count++;  
	     
	  } 
         else
          {
              head++;
              count++;
          }
        n1--;

       }
       System.out.println("Number of Tail: "+tail);
       System.out.println("Number of head: "+head);

       double  a=tail*100/count;
       double  b=head*100/count;

    System.out.println("Percentage of tail: "+a);
    System.out.println("Percentage of head: "+b);
 
    }
}
