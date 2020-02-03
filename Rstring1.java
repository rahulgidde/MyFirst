import java.util.*;
public class Rstring1
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the user name:");
       String str1=sc.next();
       String str2="Hello!! ";
   
       str2=str2+str1;
       
       System.out.println(str2);             
    
   } 
}
