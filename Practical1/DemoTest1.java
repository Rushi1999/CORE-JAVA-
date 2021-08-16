/* SELECT MODE OF SELECTION 
1.AREA OF SQUARE
2.AREA OF RECHTANGLE
 *****ACCEPT CHOICE******
 *****IF CH==1******ACCEPT SIDE******
 *****IF CH==2******ACCEPT LENGTH,BREADTH*****
 */


import java.util.Scanner;

class DemoTest1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.AREA OF SQUARE\n2.AREA OF RECTANGLE");
        int ch = sc.nextInt();

        if(ch==1)
        {
            System.out.println("ENTER SIDE");
            double side = sc.nextDouble();
            areaOfSquare(side);
        }
        else if(ch==2)
        {
            System.out.println("ENTER LENGTH");
            double leng = sc.nextDouble();

            System.out.println("ENTER BREADTH");
            double breadth = sc.nextDouble();
            areaOfReactangle(leng,breadth);

        }
        else
        {
            System.out.println("CHOICE IS INVALID");
        }
        
    }
    static void areaOfSquare(double side)
    {
        double result= side*side;

        System.out.println("AREA OF SQUARE: " +result);
    }
    static void areaOfReactangle(double leng,double breadth)
    {
        double result = leng*breadth;

        System.out.println("AREA OF REACTANGLE: "+result);
    }
}