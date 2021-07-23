/* END USER HAVING CHOICE TO ENTER CHOICE WHICH OPERATION HE WANT TO IMPLIMENT 
  IN THIS PROGRAM WE ARE LEARNING IF, ELSE IF , ELSE CONDITION*/ 


import java.util.Scanner;

class ScannerDemo6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        double n1 =  sc.nextDouble();
        System.out.println("ENTER SECOND NUMBER");
        double n2 = sc.nextDouble();
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.ADDITION\n2.MULTIPLICATION" );
        int ch = sc.nextInt();

        if(ch==1)
        {
            addition(n1,n2);
        }
        else if(ch==2)
        {
            multiplication(n1,n2);
        }
        else
        {
            System.out.println("INVALID CHOICE");
        }
    }
    static void addition(double n1, double n2)
    {
        double add=  n1+n2;
        System.out.println("ADDITION IS: "+add);
    }
    static void multiplication(double n1, double n2)
    {
        double multi = n1*n2;
        System.out.println("MULTIPLICATION IS: "+multi);
    }
}

// O/P
// ENTER FIRST NUMBER
// 10
// ENTER SECOND NUMBER
// 2
// ENTER YOUR CHOICE
// 1.ADDITION
// 2.MULTIPLICATION
// 1
// ADDITION IS: 12.0