/* coversion of minutes to second and second to minutes*/
class MethodDemo5{
    public static void main(String[] args)
    {
        minutesToSecond(5);
        secondToMinute(300);
    }
    static void minutesToSecond(double minutes)
    {
        double Total=minutes*60;
        System.out.println("TOTAL SECOND:"+Total);
    }
    static void secondToMinute(double second)
    {
        double Total=second/60;
        System.out.println("TOTAL MINUTES:"+Total);
    }
}


// output
// TOTAL SECOND:300.0
// TOTAL MINUTES:5.0