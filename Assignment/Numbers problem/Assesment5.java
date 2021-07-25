/* 1.Write a program which accept one number from user and print that number of even numbers on screen.*/

import java.util.Scanner;

class Assesment5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ");
        int n = sc.nextInt();

        evenNumber(n);
    }
    static void evenNumber(int n)
    {
        int cnt=0;
        
        for(int i=1; cnt<n;i++)
        {

            if(i%2==0)
            {
                cnt++;
                System.out.println(i*2);
            }
        }
    }
}


// o/p 
// ENTER THE NUMBER
// 4
// 4
// 8
// 12
// 16

