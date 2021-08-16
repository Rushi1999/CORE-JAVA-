/* 
********************************ACCPET NO FROM USER********************
********************************CHECK WHETHER IT A POSTIVIE AND EVEN OR NOT*****************
************IF IT IS POSTIVE AND EVEN PRINT MSG "NO IS, EVEN AND POSTIVE"*********************
********************************ELSE PRINT MSG "NO IS ODD"***********************************
*/

import java.util.Scanner;

class DemoTest2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ANY NUMBER");
        int no = sc.nextInt();

        if(no>0)
        {
            if(no%2==0)
            {
                System.out.println("NUMBER IS POSITIVE EVEN");
            }
            else
            {
                System.out.println("NUMBER IS ODD");
            }
        }
        else
        {
            System.out.println("NUMBER IS NEGATIVE");
        }
    }
}