import java.util.Scanner;
class  Pattern12
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i==row || i==row ||j==1 || j==row || i==j)
					System.out.println(" ");
				else
					System.out.println("*");
	}
}
