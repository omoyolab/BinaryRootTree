import java.util.*;
/**
 *  class AccessStaticMethod_Omoyola here.
 *
 * @author Abimbola Omoyola
 * @version (11/20/2019)
 */
public class AccessStaticMethod_Omoyola
{
    public static void main (String [] args){
    
            int userInput,m, n;
            RecursionMethod_Omoyola  recursion = new RecursionMethod_Omoyola();
        
        
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println(
                    " MENU – ACCESS STATIC METHOD – ABIMBOLA OMOYOLA \n"+
                    " 1. n!(Factorial of an Integer n) \n" +
                    " 2. a(a power n) \n"+
                    " 3. Sum(n) = 1 + 2 + 3 +....+n \n" +
                    " 4. Sum(m,n) = m +(m+1), (m+2)+.....+n \n"+
                    " 5. Fibonacci Sequence Fn \n" +
                    " 6. GCD ( The greatest common divisor of m and n) \n"+
                    " 0. Exit \n"  
                    );
                    userInput = keyboard.nextInt();
                    keyboard.nextLine();
                    
                    switch(userInput){
                    
                      case 1:
                      //n!(Factorial of an Integer n)
                      System.out.println("Enter an integer n");
                      n = keyboard.nextInt();
                      System.out.println("Factorial of n = " + n + " is " +recursion.factorial(n));
                      break;
                      
                      case 2:
                      //a(a power n)
                      System.out.println("Enter an integer n");
                      n = keyboard.nextInt();
                      System.out.println("Enter a power for " + n);
                      int power = keyboard.nextInt();
                      System.out.println("Power "+power+" of the n = "+ n + " is "+recursion.aPower(n,power));
                      break;
                      
                      case 3:
                      //Sum(n) = 1 + 2 + 3 +....+n
                      System.out.println("Enter an integer n");
                      n = keyboard.nextInt();
                      System.out.println("The sum of 1 to " + n + " is "+recursion.sum(n));
                      break;
                      
                      case 4:
                      // Sum(m,n) = m +(m+1), (m+2)+.....+n
                      System.out.println("Enter an integer m");
                      m = keyboard.nextInt();
                      System.out.println("Enter an integer n");
                      n = keyboard.nextInt();
                      System.out.println("The sum from m = " + m +" to n = " + n +  " is " +recursion.sum(m,n));
                      break;
                    
                      case 5:
                      //Fibonacci Sequence Fn
                      System.out.println("Enter an integer n");
                      n = keyboard.nextInt();
                      System.out.println("Fibonacci at n = " + n + " is " +recursion.fibonacci(n));
                      break;
                      
                      case 6:
                      //GCD ( The greatest common divisor of m and n)
                      System.out.println("Enter an integer m");
                      m = keyboard.nextInt();
                      System.out.println("Enter an integer n");
                      n = keyboard.nextInt();
                      System.out.println("Greatest Common Divisor (GCD) of "+ m + " and "+ n + " is " +recursion.GCD(m,n));
                      break;
                    
                    
                    }
 
        
        }while (userInput != 0);
        System.out.println("Program Terminated");

    }
 
}
