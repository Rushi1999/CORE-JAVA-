/*Accept one number from user and print that number of * on screen */


import java.util.Scanner;

class Lb4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER");
        int n = sc.nextInt();

        printStar(n);
    }
    static void printStar(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("*");
        }
    }
}

// O/P 
// ENTER THE NUMBER
// 5
// *
// *
// *
// *
// *