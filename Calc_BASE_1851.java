import java.util.Scanner;
public class Calc{ 
   public static void main(String []args){ 
          Scanner sc=new Scanner(System.in); 
          System.out.println("Welcome to calculator"); 
          System.out.print("Enter your first no "); 
           int a=sc.nextInt(); 
          System.out.print("Enter your second no "); 
         int b=sc.nextInt();  
          
         System.out.print("Enter Operation "); 
         char ope=sc.next().charAt(0); 
         if(ope=='+')   System.out.println(a+b); 
         else if(ope=='-')   System.out.println(a-b); 
         else if(ope=='*')   System.out.println(a*b);  
         else if(ope=='/' && b>0)   System.out.println((float)a/b); 
   
        else  System.out.println("Incorrect"); 
    }
}