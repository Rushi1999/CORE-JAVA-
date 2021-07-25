/*Write a program which accept number from user and print even factors of that number.*/


import java.util.Scanner;

class Assesment6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ");
        int n = sc.nextInt();

         display(n);

    }
    static void display(int n)
    {
        if(n<=0)
        {
            n = -n;
        }
    
        for(int i=1; i<=n;i++)
        {    
            if(n%i==0)
            {
                if(i%2==0)
                {
                    System.out.println(i+"");
                }
            }
        }
    }
}

// o/p 

// ENTER THE NUMBER
// 24
// 2
// 4
// 6
// 8
// 12
// 24