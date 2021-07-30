class MainApp7
{
    public static void main(String[] args)
    {
        Display dl = new Display();

        dl.test();

        System.out.println(dl); // THIS LINE PRINT FIRST @COPY ADDRESS

        Display d2 = new Display(); // THIS LINE PRINT SECONF @COPY ADDRESS
        System.out.println(d2);
        
    }
  
}
class Display
{
    int k = 10;

    void test()
    {
        System.out.println("INSIDE TEST METHOD");
    }
}

// O/P 

// INSIDE TEST METHOD
// Display@15db9742