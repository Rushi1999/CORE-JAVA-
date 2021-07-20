import java.util.Scanner;
class ScannerDemo1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");

        String name = sc.next();

        System.out.println("Good bye: "+name);
    }
}


// O/P 

// ENTER YOUR NAME
// FISHA
// Good bye: FISHA