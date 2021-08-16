/*5.Write a program which accept number from user and return difference between
summation of all its factors and non factors.

Input : 12
Output : -34 (16 - 50)
Input : 10
Output : -29 (8 - 37)

*/
import java.util.Scanner;
class Assesment14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT");
        int n = sc.nextInt();

        int sum = 0;
        int sub = 0;
        for(int i=1; i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
            }
            else
            {
                sub = sub + i ;
            }
        }
        int total = sum - sub;

        System.out.println(total);
    }
}