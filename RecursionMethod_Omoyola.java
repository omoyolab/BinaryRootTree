
/**
 *  class RecursionMethod_Omoyola .
 *
 * @author Abimbola Omoyola
 * @version 11/20/2019
 */
public class RecursionMethod_Omoyola
{
    public static int factorial(int n)
    {
        int nMinus1Factorial;
        if ( n == 0)
         return (1);
         else
         {nMinus1Factorial = factorial(n-1);
             return ( n * nMinus1Factorial);
            }
    }
    
    public static int aPower(int base,int n)
    {
        if(n == 0)
            return 1;
        else
             return (base * aPower(base,n -1));
   }
    
   
    public static int sum(int n)
    {
        int nSum;
        if( n == 0)
            return 0;
         else
         { nSum = sum(n-1);
             return( n + nSum);
            }
    
    }
    
    public static int sum(int m, int n)
    {
           if( n == m)
            return n;
         else
          return sum(m,n-1)+ n;
           
            
    }
    
    public static int fibonacci(int n)
    {
        if(n ==1 || n ==2)
            return 1;
        else
        { int rp1 = fibonacci(n-1);
          int rp2 = fibonacci(n-2);
          int gs = rp1+rp2;
          return gs;
        }
    
    }
    
     public static int GCD(int n, int m)
    {
        if (m == 0)
         return n;
         else
          return GCD(m, n % m);
    
    }
    
}
