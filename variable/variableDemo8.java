/*swap number using temp variable and without using temp varibale */

class VariableDemo8
{
    public static void main(String[] args)
    {
        int x1=25,x2=50,temp;

        System.out.println(x1+"\t"+x2);

        //Approach 1 temp variable
        temp=x1; // 25
        x1=x2; // 50
        x2=temp; // 

        System.out.println(x1+"\t"+x2);

        //Approach 2

        x1=x1+x2; // 25+50=75
        x2=x1-x2; // 75-50=25
        x1=x1-x2; // 75-25-=50

        System.out.println(x1+"\t"+x2);
    }
}