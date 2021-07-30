/*  
                                                         TICKETS 
                                                            |
                                 |--------------------------|-------------------------------|
                                 |                          |                               |
                           BOOK TICKETS                 CANCEL TICKETS             AVAILABLE TICKETS
                                 |                          |                               |
                                 |                          |                               |
                                 |                          |                               |
                           --------------              -------------                    ---------------
                          |   BT<=AT    |              |AT+CT<=200 |                    |  S.O.P(AT)  |
                           --------------              -------------                     --------------
*/

import java.util.Scanner;

class Ticket
{
    static int maximumTicket = 200;
    static int totalAvailableTicket = 50;

    void bookTicket(int book)
    {
        if(totalAvailableTicket>=book)
        {
            totalAvailableTicket = totalAvailableTicket - book;
            System.out.println(book+" TICKETS BOOK SUCCESSFULLY");
            availableTicket();
        }
        else 
        {
            System.out.println("SORRY TICKETS NOT AVAILABLE");
        }
    }
    void cancelTicket(int cancel)
    {
        if(totalAvailableTicket<=cancel)
        {
            totalAvailableTicket = totalAvailableTicket + cancel;
            System.out.println(cancel+" TICKETS CANCEL SUCCESSFULLY");

            availableTicket();
        }   
        else
        {
            System.out.println("YOU ENTER WRONG CHOICE");
        }
    }
    void availableTicket()
    {
        System.out.println("TICKETS AVAILABLE "+totalAvailableTicket);
    }
}
class MainApp1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT YOUR CHOICE");
        System.out.println("1:BOOK TICKETS\n2:CANCEL TICKETS\n3:AVAILABLE TICKETS");
        int ch = sc.nextInt();

        Ticket t1 = new Ticket();

        if(ch==1)
        {
            System.out.println("ENTER HOW MANY TICKETS YOU WANT TO BOOK");
            int book =sc.nextInt();

            t1.bookTicket(book);
        }
        else if(ch==2)
        {
            System.out.println("ENTER HOW MANY TICKETS YOU WANT TO CANCEL");
            int cancel = sc.nextInt();

            t1.cancelTicket(cancel);
        }
        else if(ch==3)
        {
            t1.availableTicket();
        }
        else
        {
            System.out.println("INVALID CHOICE");
        }
    }
}