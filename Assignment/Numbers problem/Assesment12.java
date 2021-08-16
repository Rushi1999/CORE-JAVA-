/*3.Write a program which accept number from user and display all its non factors.
Input : 12
Output : 5 7 8 9 10 11
Input : 13
Output : 2 3 4 5 6 7 8 9 10 11 12
Input : 10
Output : 3 4 6 7 8 9
*/

import java.util.Scanner;
class Assesment12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT");
        int n = sc.nextInt();

        for(int i=1;i<n;i++)
        {
            if(n%i!=0)
            {
                System.out.println(i);
            }
        }
    }
}