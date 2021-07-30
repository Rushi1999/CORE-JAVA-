/*2.Write a program which accept number from user and display its factors in
decreasing order.


Input : 13
Output : 1
Input : 10
Output : 5 2 1
*/

import java.util.Scanner;
class Assesment11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int n = sc.nextInt();

        factorDes(n);
    }
    static void factorDes(int n)
    {
        for(int i=1;i<=n;i++)
        {
           if(n/i==0)
           {
               System.out.println(i+"");
           }
        }
    }
}