/* COMPEAR TWO NUMBER *IN THIS SECTION WE ARE LEARNING CONDITION*/

import java.util.Scanner;

class ScannerDemo8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        double n1 = sc.nextDouble();
        System.out.println("ENTER SECOND NUMBER");
        double n2 = sc.nextDouble();

        if(n1>n2)
        {
            System.out.println(+n1+" IS GREATER THAN "+n2);
        }
        else if(n2>n1)
        {
            System.out.println(+n1+" IS LESS THAN "+n2);
        }
        else
        {
            System.out.println(+n1+"EQUAL TO"+n2);
        }
    }
    
}


// O/P 

// ENTER FIRST NUMBER
// 1
// ENTER SECOND NUMBER
// 2
// 1.0 IS LESS THAN 2.0