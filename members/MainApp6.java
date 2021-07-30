/* CALCULATE AREA AND CERCUMFRENCE OD CIRCLE USING STATIC MEMBER*/ 
import java.util.Scanner;
class MainApp6
{
    public static void main(String[] args)
    {

    Scanner sc = new Scanner(System.in);

    Display dl = new Display(); // create refrence object for the accessing external method or class

    System.out.println("SELECT TOUR CHOICE");
    System.out.println("1.AREA OF CIRCLE\n2.CIRCUMFRENCE OF CIRCLE");
    System.out.println("ENTER YOUR CHOICE");
    int ch = sc.nextInt();

    System.out.println("ENTER RADIUS OF CIRCULE");
    double radius = sc.nextDouble();

        if(ch==1)
        {
            dl.areaOfCircle(radius);
        }
        else if(ch==2)
        {
            dl.areaOfCircumfrence(radius);
        }
    }
}
class Display
{
    static double pi= 3.14;

    void areaOfCircle(double radius)
    {
        double area = pi*radius*radius;
        System.out.println("AREA OF CIRCLE:"+area);
    }
    void areaOfCircumfrence(double radius)
    {
        double circum = 2*pi*radius;
        System.out.println("CIRCUMFRENCE OF CIRCLE:"+circum);
    }
}