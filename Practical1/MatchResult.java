/*
1.ENTER TOTAL NO OF WINS(25 REWARD)
2.ENTER TOTAL NO LOSS (-5 REWARD)
3.ENTER TOTAL NO OF DRAWS (10 REWARD)
4.DISPLAY REAWAD

NOTE: READ STMT AGAIN
*/

import java.util.Scanner;

class MatchResult
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER TOTAL NO OF WINS");
        int win = sc.nextInt();

        System.out.println("ENTER TOTAL NO OF LOSS");
        int loss = sc.nextInt();

        System.out.println("ENTER TOTAL NO OF DRAW");
        int draw = sc.nextInt();

        final_cal(win,loss,draw);

    }
    static void final_cal(int win,int loss, int draw)
    {
       int result = (25*win + 10*draw - 5*loss)  ;

       System.out.println("REWARD POINT IS: "+result);
    }
}