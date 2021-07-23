/* CALCULATE AREA OF CIRCLE*/

import java.util.Scanner;
class ScannerDemo9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RADIUS");
        double radius = sc.nextDouble();

        if(radius<20)
        {
            areaOfCircle(radius);
        } 
        else
        {
            System.out.println("RADIUS IS GRATER THAN 20");
        }
    }
    static void areaOfCircle(double radius)
    {
        double area = 3.14*radius*radius;

        System.out.println("AREA OF CIRCLE: "+area); 
    }
}