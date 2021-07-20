/* passing input as a parameter*/

class MethodDemo3
{
    public static void main(String[] args)
    {
        System.out.println("INSIDE MAIN METHOD");
        account("Rushi");// passing parameter as a input for method
    }
    static void account(String name)
    {
        System.out.println("Welcome"+name);
        System.out.println("Account created Successfully");
        profile();
    }
    static void profile()
    {
        System.out.println("Profile Created Successfully");
    }
}

// output
// INSIDE MAIN METHOD
// WelcomeRushi
// Account created Successfully
// Profile Created Successfully