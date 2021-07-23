/* MEMBERS FUNCTION BY ACCEPTING EXTERNAL CLASS IN MAIN CLASS*/                                                                                                                       

class MembersDemo
{
    static int k=20;

    static void test()
    {
        
        System.out.println("INSIDE DEMO CLASS");
    }
}
class MainApp
{
    public static void main(String[] args)
    {
        System.out.println("K VALUE IS: "+MembersDemo.k);
        MembersDemo.test();
    }  
}

// O/P 
// K VALUE IS: 20
// INSIDE DEMO CLASS