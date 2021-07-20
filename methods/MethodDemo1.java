// call external fun inside main function 
class MethodDemo1
{
    public static void main(String[] args)
    {
        System.out.println("INSIDE MAIN");
        display();
    }
    static void display()
    {
        System.out.println("INSIDE DISPLAY");
    }
}


// output

// INSIDE MAIN
// INSIDE DISPLAY