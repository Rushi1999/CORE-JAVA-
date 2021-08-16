/*
5.Write a program which accept number from user and count frequency of such a
digits which are less than 6.
Input : 2395
Output : 3
Input : 1018
Output : 3
Input : 9440
Output : 3
Input : 96672
Output : 1
*/
import java.util.Scanner;
class Assesment19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT");
        int n = sc.nextInt();

        int count =0 , iDigit=0;

        while(n!=0)
        {
            iDigit = n % 10;
            n = n/ 10;

            if(iDigit < 6)
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
}
