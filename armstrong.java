import java.util.*; 

public class armstrong {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); int s=0;
        int k = n;
        while(k>0)
        {
            int d=k%10;
            s=s+(d*d*d);
            k=k/10;
        }
        if(s==n)
        System.out.println("ARMSTRONG");
        else System.out.println("NOT ARMSTRONG");

    }
}
