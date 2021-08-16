//NON_STATIC BLOCK LOAD (IMPLICITLY)
class NonStaticBlock
{
    static 
    {
        System.out.println("STATIC BLOCK 1");
    }
    //NON-STATIC BLOCK
    {
        System.out.println("NON_STATIC BLOCK");
    }
    public static void main(String[] args)
    {
        System.out.println("MAIN METHOD");
    // call or load non-static class
        NonStaticBlock n1 = new NonStaticBlock();
    }

}