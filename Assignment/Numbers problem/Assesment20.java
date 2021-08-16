/*
1.Write a program which accept number from user and return the count of even
digits.
Input : 2395
Output : 1
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 4
*/

import java.util.Scanner;
class Assesment20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT");
        int n = sc.nextInt();

        int iDigit=0,count=0;
        while(n!=0)
        {
            iDigit = n%10;
            n=n/10;

            if(iDigit%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}