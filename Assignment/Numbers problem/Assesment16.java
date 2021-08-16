/*1.Write a program which accept number from user and display its digits in reverse
order.
Input : 2395
Output : 5
9
3
2
Input : 1018
Output : 8
1
0
1
Input : -1018
Output : 
8
1
0
1
Input : 9000
Output :
0
0
0
9

*/
import java.util.Scanner;
class Assesment16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT");
        int n = sc.nextInt();

        int digit=0,iValue=0;
        if(n<0)
        {
            n = -n;
        }

      while(n!=0)
        {
            digit = n % 10;
            System.out.println(digit);
            n = n/10;
        }

    }
}