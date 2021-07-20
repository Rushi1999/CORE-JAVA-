/*claculate area of TRIANGLE and SQUAR*/

class MethodDemo4
{
    public static void main(String[] args)
    {
        // seprate call for both method
        
        areaOfSquare(5); // passing para to method
        areaOfTriangle(5,3);
    }
    static void areaOfSquare(double side)
    {
        double Result= side*side;
        System.out.println("AREA OF SQUAR:"+Result);
    }
    static void areaOfTriangle(double b, double height)
    {
        double Result= 0.5*b*height;
        System.out.println("AREA OF TRIANGLE:"+Result);
    }
}


// output
// AREA OF SQUAR:25.0
// AREA OF TRIANGLE:7.5