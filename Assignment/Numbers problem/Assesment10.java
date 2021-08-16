/* 1.Write a program which accept number from user and display its multiplication of factors.

Input : 12
Output : 144 (1 * 2 * 3 * 4 * 6)
Input : 13
Output : 1 (1)
Input : 10
Output : 10 (1 * 2 * 5)

*/

import java.util.Scanner;

class Assesment10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ANY NUMBER");
        int n = sc.nextInt();

        multiplicationFactor(n);
    
    }

    static void multiplicationFactor(int n)
    {
        int mult=1; 

        for(int i=1; i<n;i++) 
        {
            
            if(n%i==0) 
            {
               mult = mult * i; 
            }
        }
        System.out.println(mult);
       
    }

}