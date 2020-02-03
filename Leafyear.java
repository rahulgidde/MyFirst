import java.util.*;
public class Leafyear
{
   public static void main(String [] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int n=sc.nextInt();


        if(n%400==0 || n%100==0 && n%400==0)
        {
           System.out.println("Year is Leaf");
        }
       else
        {
          System.out.println("Year is not Leaf");
        }
 
              
            
	 
      
              
       
         
   }
}
