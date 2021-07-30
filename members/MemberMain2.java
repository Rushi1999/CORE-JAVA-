/* WRITE A PROGRAM TO PERFORM OPERATION BASED ON USER INPUT
1.CALCULATE AREA OF CIRCLE
2.CALCULATE CIRCUMFRENCE OF CIRCLE
3.TO PERFORM THIS OPERATION ACCEPT RADIUS FROM END USER
*/

import java.util.Scanner;

class TestDemo
{
    static double pi=3.14;

    void areaOfCircle(double r)
    {
        double area = pi * r *r;

        System.out.println("AREA OF CIRCLE IS:"+area);
    }
    void circumfrenceOfCircle(double  r)
    {
        double circumf = 2 * pi * r;

        System.out.println("CIRCUMFERNCE OF CIRCLE IS: "+circumf);
    }

}
class MemberMain2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER RADIUS OF CIRCLE");
        double r = sc.nextDouble();
        
        new TestDemo().areaOfCircle(r);   // acces external non static class by creating class object
        new TestDemo().circumfrenceOfCircle(r);
    }
}


// O/P 
// ENTER RADIUS OF CIRCLE
// 5
// AREA OF CIRCLE IS:78.5
// CIRCUMFERNCE OF CIRCLE IS: 31.400000000000002