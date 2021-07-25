/*Accept one number from user and print that number of * on screen.*/

import java.util.Scanner;

class Assestment1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER");
        int n = sc.nextInt();

        starPrint(n);
    }
    static void starPrint(int n)
    {
        while(n>0)
        {
            System.out.println("*");
            n--;
        }
    }
}