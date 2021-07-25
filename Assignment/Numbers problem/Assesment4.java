/*Accept number from user and check whether number is even or odd.*/

import java.util.Scanner;

class  Assesment4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int n = sc.nextInt();

        display(n);
    }
    static void display(int n)
    {
        if(n%2==0)
        {
            System.out.println("NUMBER IS EVEN");
        }
        else
        {
            System.out.println("NUMBER IS ODD");
        }
    }
}

// O/P 

// ENTER ANY NUMBER
// 5
// NUMBER IS ODD

// ENTER ANY NUMBER
// 2
// NUMBER IS EVEN