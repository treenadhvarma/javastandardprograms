import java.util.Scanner;
class TwistedprimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0;
		int count2=0;
		int a=0;
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}
		while (n!=0)
		{
			int ld=n%10;
			a=(a*10)+ld;
			n=n/10;
		}
		for (int j=1;j<=a;j++)
		{
			if (a%j==0)
			{
				count2++;
			}
		}
		if (count==2&&count2==2)
		{
			System.out.println("twisted prime");
		}
		else
		{
			System.out.println("not a twisted prime");
		}
	}
}
