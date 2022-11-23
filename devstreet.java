import java.util.Scanner;
class DevStreet
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THE DEVSTREET COMMUNITY\nEnter the name of the President of DevStreet");
        String name=sc.nextLine();
        System.out.println("Enter e-mail id");
        String email=sc.nextLine();
        System.out.println("Enter phone number");
        long phn=sc.nextLong();
        System.out.println("Name : "+name+"\nE-mail id : "+email+"\nPhone number :"+phn);
    }
}