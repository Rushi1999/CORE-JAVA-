/* CALCULATE AREA OF TRIANGLE PASSING PARA TO SINGLE METHOD*/

class MethodDemo9
{
    public static void main(String[] args)
    {
        double totalArea= areaOfTriangle();

        System.out.println("AREA OF TRIANGLE: "+totalArea);
        
    }
    static double addition(double a, double b)
    {
        double result= a+b;
        return result;
    }
    static double  areaOfTriangle()
    {
        double radius=addition(5,4);

        double area= 3.14*radius*radius;

        return area;
    }
}