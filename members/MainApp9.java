/* WRITE PROGRAM TO PROF THAT STATIC MEMEBER HAVING SIGNEL COPY AND NON-STATIC MEMBER HAVING MUTIOLE COPYS */

class Master
{
    static int p = 10;
    int j = 20;
}
class MainApp9
{
   public static void main(String[] args)
   {
        Master m1 = new Master();

        System.out.println("BEFORE RE-INITIALIZARION VALUE OF P IS: "+m1.p);
        System.out.println("BEFORE RE-INITIALIZARION VALUE OF P IS: "+m1.j);
    
        //INITIALIZE P AND J VALUES

        m1.p=40;
        m1.j=50;

        System.out.println("***********************************************");
        System.out.println("AFTER RE-INITIALIZATION VALUE OF P IS:" +m1.p);
        System.out.println("AFTER RE-INITIALIZATION VALUE OF J IS: "+m1.j);
        System.out.println("***********************************************");
        //CREATE SECOND REFRENECE VARIABLE
        Master m2 = new Master();
        System.out.println("P VALUE IS: "+m2.p);   
        System.out.println("J VALUR IS: "+m2.j);
       


   }
}
