import java.util.*;
public class Calculator{
	 public static void main(String []args){ 
	      Scanner sc=new Scanner(System.in); 
          System.out.println("*****Welcome to calculator*****"); 
          System.out.print("Enter your first no : "); 
          int a=sc.nextInt(); 
          System.out.print("Enter your second no : "); 
          int b=sc.nextInt();  
          
         System.out.print("Enter Operation "); 
         char ope=sc.next().charAt(0); 
         if(ope=='+')   System.out.println(sum(a+b)); 
         else if(ope=='-')   System.out.println(sub(a-b)); 
         else if(ope=='*')   System.out.println(mul(a,b));  
         else if(ope=='/' && b>0)   System.out.println(div(a,b)); 
       //  else if(ope=='/' && b==0) System.out.println("Number cannot be divide by zero");
         else  System.out.println("Incorrect"); 
	
}
}