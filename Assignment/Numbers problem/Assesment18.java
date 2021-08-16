/*
3.Write a program which accept number from user and count frequency of 2 in it.
Input : 2395
Output : 1
Input : 1018
Output : 0
Input : 9000
Output : 0
Input : 922432
Output : 3
*/

import java.util.Scanner;
class Assesment18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT");
        int n = sc.nextInt();

        int iDigit=0,count=0;
        while (n!=0)
        {
            iDigit = n %10;

            n = n/10;

            if(iDigit==2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
