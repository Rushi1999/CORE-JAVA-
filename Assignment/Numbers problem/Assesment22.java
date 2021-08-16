/*
Accept single digit number from user and print it into word.
Input : 9
Output : Nine
Input : -3
Output : Three
Input : 12
Output : Invalid Number
*/

import java.util.Scanner;

class Assesment22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT");
        int n = sc.nextInt();

        String S= Integer.toString(n);

        System.out.println(S);

    }
}