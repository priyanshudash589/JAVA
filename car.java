import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class car
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int s=sc.nextInt();
		    if(s<300)
		    System.out.println(3000);
		    else System.out.println(s*10);
		}
	}
}
