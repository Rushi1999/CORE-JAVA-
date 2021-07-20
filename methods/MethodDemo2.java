/* I---> 1 main method 
   E--->1 welcome to Qspider
   E--->2 Good morning have a nice day
*/
class MethodDemo2
{
    public static void main(String[] args)
    {
       System.out.println("INSIDE MAIN METHOD");
        firstMassage(); //call for first method (firstMassage)
        firstMassage(); // write once call multiple times
    }
    static void firstMassage()
    {
        System.out.println("Welcome to Qspider");
        secodMassage(); //call for second method (secodMassage)  
    }
    static void secodMassage()
    {
        System.out.println("Good morning have a nice day..");
    }
}


// output
// INSIDE MAIN METHOD
// Welcome to Qspider
// Good morning have a nice day..
// Welcome to Qspider
// Good morning have a nice day..