class Display
{
    int studentRoll;
    String studentName;
    double studentPercentage;

    void acceptDetails(int roll, String name, double percentage)
    {
        studentRoll = roll;
        studentName = name;
        studentPercentage = percentage;        
    }
    void displayDetails()
    {
        System.out.println("STUDENT ROLL NUMBER IS: "+studentRoll);
        System.out.println("STUDENT NAME IS: "+studentName);
        System.out.println("STUDENT PERCE IS: "+studentPercentage);

        System.out.println("*************************");
    }
}


class MainApp8
{
    public static void main(String[] args)
    {
        Display d1 = new Display();
        d1.acceptDetails(21,"Rushi",96.40);
        d1.displayDetails();

        Display d2 = new Display();
        d2.acceptDetails(27,"Nisha",77);
        d2.displayDetails();
    }
}