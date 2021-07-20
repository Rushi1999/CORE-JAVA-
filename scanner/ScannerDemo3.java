/* WRITE PROGRAM OR USE nextLine()  METHOD IS USE FOR ACCEPTING STRING OUTPUT WITH SPACE*/

import java.util.Scanner;

class ScannerDemo3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        

        System.out.println("ENTER YOUR COURSE NAME");
        String name = sc.nextLine();
        

        System.out.println("YOUR COURSE NAME IS: "+name);
    }
}

// O/P 
// ENTER YOUR COURSE NAME
// CORE JAVA
// YOUR COURSE NAME IS: CORE JAVA