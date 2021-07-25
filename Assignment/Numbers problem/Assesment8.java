/*Accept one character from user and convert case of that character.*/
import java.util.Scanner;
class Assesment8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER CHARACTER");
        char ch = sc.next().charAt(0);

        display(ch);
    }

    static void display(char ch)
    {
        if(ch>65 || ch<90)
        {
            
            char ch1 = Character.toLowerCase(ch); 
            
            System.out.println(ch1);
        }
        else if(ch>97 || ch<122)
        {
            char ch1 = Character.toUpperCase(ch);
            System.out.println(ch1);
        }
    }

}


/* 
****************************op*****************

ENTER CHARACTER
A
a

**********************************************
/*