import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class burgerparty
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int s=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int h=s*x;
		    if(h>y)
		    System.out.println("NO");
		    else System.out.println("YES");
		    
		    
		}
	}
}

