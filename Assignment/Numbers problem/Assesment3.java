/* Accept two numbers from user and display first number in second
number of times.*/

import java.util.Scanner;
class Assesment3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NO");
        int n1 = sc.nextInt();

        System.out.println("ENTER SECOND NO");
        int n2 = sc.nextInt();

        display(n1,n2);
    }
    static void display(int n1, int n2)
    {
        for(int i=1;i<=n2;i++)
        {
            System.out.println(n1);
        }
    }
}


// O/p 

// ENTER FIRST NO
// 12
// ENTER SECOND NO
// 5
// 12
// 12
// 12
// 12
// 12