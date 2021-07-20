/* CALCULATE PERCENTAGE BY PASSING PARAMTER TO EXTERNAL NON-VOID METHOD*/


class MethodDemo10
{
    public static void main(String[] args) // step1 
    {
        double finalPercentage= totalPercentage(70,65,77); // step 2

        System.out.println("TOTAL PERCENTAGE: "+finalPercentage); // last 
    }
    static double totalMark(double m1,double m2,double m3) // step 5
    {
        double mark=m1+m2+m3;

        return mark;
    }
    static double totalPercentage(double m1,double m2,double m3) // step 3
    {
        double obtainMark= totalMark(m1,m2,m3); // step 4

        double percentage=  (obtainMark/300)*100;

        return percentage;
    }
}