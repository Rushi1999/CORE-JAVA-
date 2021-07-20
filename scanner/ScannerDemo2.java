/* TO TAKE TWO NUMBER FROM USER AND DISPLAY MULTIPLICATION*/


import java.util.Scanner;

class ScannerDemo2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER");
        Double n1= sc.nextDouble();

        System.out.println("ENTER SECOND NUMBER");
        Double n2= sc.nextDouble();

        System.out.println("MULTIPLICATION IS: " +n1*n2);
    }
}

// O/P
// ENTER FIRST NUMBER
// 5
// ENTER SECOND NUMBER
// 2
// MULTIPLICATION IS: 10.0