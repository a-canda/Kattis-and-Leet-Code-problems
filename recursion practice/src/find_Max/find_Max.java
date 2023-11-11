package find_Max;

import java.util.*;
public class find_Max
{
   public static void main(String[] args)
   {
   
     Scanner keyin = new Scanner(System.in);
     int n; // user enters this integer
     System.out.println("Please enter an integer:");
     n = keyin.nextInt();
     double max = 0;
     double num; 
     int i = 1;
     while( i <= n )
     {
        System.out.println("Integer #" + i);
        num = keyin.nextInt();
        if (num > max)
            max = num;
        i++;
     }
     System.out.println("Max = " + max );  
   }
}