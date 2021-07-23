/* CHECK NO IS NEGATIVE OR NOT THEN CALCULATE ADDITON*/

import java.util.Scanner;

class ScannerDemo5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
        double n1= sc.nextDouble();
        System.out.println("ENTER SECOND NUMBER: ");
        double n2= sc.nextDouble();

        if(n1>0 && n2>0)
        {
            double add = n1+n2;
            System.out.println("AADITION IS : "+add);
        }
        else
        {
            System.out.println("NUMBER IS NEGATIVE");
        }
        
    }
}