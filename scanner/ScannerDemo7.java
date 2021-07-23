/* TAKE AGE AS INPUT FROM END USER AND CHECL AGE IS GREATER OR EQUAL 18 IF 
    1. IF AGE IS GREATER THAN 18 THEN UR ELIGIBLE FOR TAKING VACCINATION.
    2. IF AGE IS SMALLER THAN 18 THEN UR NOT ELIGIBLE.
*/

import java.util.Scanner;

class ScannerDemo7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER AGE");
        int age = sc.nextInt();

        if(age<18)
        {
            System.out.println("YOU ARE NOT ELIGIBLE FOR VACCINATION");
        }
        else
        {
            System.out.println("YOU ARE ELIGIBLE FOR VACCINATION");
        }
    }
}


// O/P 

// ENTER AGE
// 12
// YOU ARE NOT ELIGIBLE FOR VACCINATION

// ENTER AGE
// 18
// YOU ARE ELIGIBLE FOR VACCINATION

