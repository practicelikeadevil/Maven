package aaa.aaa;
import java.io.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        Addition a1=new Addition();
        System.out.println(a1.add(a,b));
        Subtraction a2=new Subtraction();
        System.out.println(a2.sub(a,b));
    }
}
