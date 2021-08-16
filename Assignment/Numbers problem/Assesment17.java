/*
2.Write a program which accept number from user and check whether it contains 0
in it or not.
Input : 2395
Output : There is no Zero
Input : 1018
Output : It Contains Zero
Input : 9000
Output : It Contains Zero
Input : 10687
Output : It Contains Zero
*/

import java.util.Scanner;

class Assesment17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT");
        int n = sc.nextInt();
        int iDigit=0;
        while (n!=0)
        {
            iDigit = n % 10;
            // System.out.println(iDigit);
            n = n/10;

            if(iDigit==0)
            {
                System.out.println("ZERO");        
            }
            else
            {
                System.out.println("NONZERO");
            }
        }
        // if(iDigit==0)
        // {
        //     System.out.println("ZERO");        
        // }
        // else
        // {
        //     System.out.println("NONZERO");
        // }
        
    }
}