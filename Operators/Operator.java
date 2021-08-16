import java.util.Scanner;
class Operator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT OPERATION");
        System.out.println("1.ARITHMATIC OPERATOR\n2.ASSIGNMENT OPERATOR\n3.RELATIONAL OPERATOR\n4.UNARY OPERATOR\n5.LOGICAL OPERATOR\n6.BITWISE OPERATOR\n7.TERNARY OPERATOR");
        int ch = sc.nextInt();

        if(ch==1)
        {
            System.out.println("ENTER VALUE OF A");
            int a = sc.nextInt();
            System.out.println("ENTER VALUE OF B");
            int b = sc.nextInt();
            arithmeticOperator(a,b);
        }
        else if(ch==2)
        {
            System.out.println("ENTER VALUE OF A");
            int a = sc.nextInt();
            assignmentOperator(a);
             
        }
        else if(ch==3)
        {
            System.out.println("ENTER VALUE OF A");
            int a = sc.nextInt();
            System.out.println("ENTER VALUE OF B");
            int b = sc.nextInt();
            relationalOperator(a,b);
        }
        else if(ch==4)
        {
            System.out.println("ENTER VALUE OF A");
            int a = sc.nextInt();
            unaryOperator(a);
        }
        else if(ch==5)
        {
            System.out.println("ENTER VALUE OF A");
            int a = sc.nextInt();
            System.out.println("ENTER VALUE OF B");
            int b = sc.nextInt();
            logicalOperator(a,b);
        }
        else if(ch==6)
        {
            System.out.println("ENTER VALUE OF A");
            int a = sc.nextInt();
            System.out.println("ENTER VALUE OF B");
            int b = sc.nextInt();

            bitWise(a,b);
        }
        else if(ch==7)
        {
            System.out.println("ENTER NUMBER");
            int n = sc.nextInt();
            ternaryOperator(n);
        }
        else
        {
            System.out.println("INVALID CHOICE");
        }
    }
    static void arithmeticOperator(int a, int b)
    {
        System.out.println("ADDITION OF TWO NUMBER: "+a+b);
        System.out.println("SUBTRACTION OF TWO NUMBER: "+ (a-b));
        System.out.println("MULTIPLICATION OF TWO NUMBER: "+a*b);
        System.out.println("DIVISION OF TWO NUMBER: "+a/b);
        System.out.println("MODULO OF TWO NUMBER: "+a%b);
       
    }
    static void assignmentOperator(int a )
    {
        a=10;
        System.out.println("ASSIGNMENT OPERATOR: " +a);
        a+=10;
        System.out.println("ADDITION AND ASSIGNMENT OPERATOR: " +a);
        a-=10;
        System.out.println("SUBTRACTION AND ASSIGNMENT OPERATOR: " +a);
        a/=10;
        System.out.println("DIVISION AND ASSIGNMENT OPERATOR: " +a);
        a%=10;
        System.out.println("MODULO AND ASSIGNMENT OPERATOR: " +a);
    }
    static void relationalOperator(int a, int b)
    {
        System.out.println("EQUAL TO OPERATOR: " + (a==b));
        System.out.println("LESSTHAN OPERATOR: " + (a<b));
        System.out.println("OPERATOR OPERATOR: " + (a>b));
        System.out.println("LESSTHAN AND EQUALTO OPERATOR: " + (a<=b));
        System.out.println("GREARTER THAN AND EQUALTO OPERATOR: " +(a>=b));
        System.out.println("NOT EQUALTO OPERATOR: " + (a!=b));

    }
    static void unaryOperator(int a)
    {
        int c;
        c = a++;
        System.out.println("POST-INCREAMENT OPERATOR: "+c);
        c = ++a;
        System.out.println("PRE-INCREAMENT OPERATOR: "+c);
        c = a--;
        System.out.println("POST-DECREAMENT OPERATOR: "+c);
        c = --a;
        System.out.println("PRE-DECREAMENT OPERATOR: "+c);
    }
    static void logicalOperator(int a , int b)
    {
        if(a>5 && b<5)
        {
            System.out.println("A is > 5 && B is < 5 ");
        }
        else
        {
            System.out.println("ONE CONDITION IS FALSE\n");
        }

        if(a>5 || b<5)
        {
            System.out.println("A is > 5 || B is < 5 ");
        }
        else
        {
            System.out.println("BOTH CONDITION IS FALSE");
        }
    }
    static void bitWise(int a, int b)
    {
        int c = a&b;
        System.out.println("BITWISE '&' OPERATOR: "+c);
         c = a|b;
        System.out.println("BITWISE '|' OPERATOR: "+c);
        
    }
    static void ternaryOperator(int n)
    {
        String output = (n>0)? "POSTIVE":"NEGATIVE";
        System.out.println("NO IS "+output);
    }

}