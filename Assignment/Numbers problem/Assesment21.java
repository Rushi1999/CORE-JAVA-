/*
4.Write a program which accept number from user and return multiplication of all
digits.
Input : 2395
Output : 270
Input : 1018
Output : 8
Input : 9440
Output : 144
Input : 922432
Output : 864
*/

import java.util.Scanner;
class Assesment21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT");
        int n = sc.nextInt();

        int iDigit=0,mul=1;

        while(n!=0)
        {
            iDigit = n % 10;
           
            n=n/10;
            if(iDigit >0)
            {
                mul = mul * iDigit;
            }
               
        }
        System.out.println(mul);
    }
}