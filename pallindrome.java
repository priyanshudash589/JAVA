import java.util.*;

public class pallindrome {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number To Be Checked : "+"\n");
        int num = sc.nextInt();
        int k= num;int c=0;
        while(k>0)
        {
            int d=k%10;
            c=(c*10)+d;
            k=k/10;
        }
        if(c==num)
        System.out.println("The number is pallindrome!");
        else
        System.out.println("the number is not pallinderome!");


    }
    
}
