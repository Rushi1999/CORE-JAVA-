/*Accept on number from user if number is less than 10 then print
'Hello' otherwise print 'Demo'. */
import java.util.Scanner;
 class Assesment2
 {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);

         System.out.println("ENTER NUMBER");
         int n = sc.nextInt();

         compareNumber(n);

     }
     static void compareNumber(int n)
     {
         if(n<10)
         {
             System.out.println("Hello");
         }
         else if(n>10)
         {
             System.out.println("Demo");
         }
         else
         {
             System.out.println("NUMBER IS QEUAL TO 10");
         }
     }
 }

//  O/p

// ENTER NUMBER
// 2
// Hello

// ENTER NUMBER
// 11
// Demo

// ENTER NUMBER
// 10
// NUMBER IS QEUAL TO 10
