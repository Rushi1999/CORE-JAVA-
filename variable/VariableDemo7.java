class VariableDemo7{
    public static void main(String[] args)
    {
        char ch1='A',ch2='B',ch3='c';

        System.out.println(ch1+"\t"+ch2+"\t"+ch3);

        ch1=ch2; // ch1=B
        ch2=ch3; // ch2=C
        ch3=ch1; // ch3=B

        System.out.println(ch1+"\t"+ch2+"\t"+ch3);//B C B
    }
}