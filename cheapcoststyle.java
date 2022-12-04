import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cheapcoststyle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int f=x+y;
		    int g=a+b;
		    if(f>=g)
		    System.out.println(g);
		    else System.out.println(f);
		}
	}
}