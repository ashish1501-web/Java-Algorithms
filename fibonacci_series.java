package Recursion;
import java.util.*;

class fibonacci{
    void fib(int n,int a,int b)
    {
        if(n==0)        //0 1 1 2 3 5 8 13 21
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        fib(n-1,b,c);
    }
    int nthfib(int n)
    {
        if(n==1 )
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        return nthfib(n-1)+nthfib(n-2);
    }
}
public class fibonacci_series {
    public static void main(String[] args) {
        fibonacci f=new fibonacci();
        int a=0,b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        f.fib(n-2,a,b);


        System.out.println(f.nthfib(5));  
    }
}
