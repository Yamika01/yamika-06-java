import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();int i;
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int k=sc.nextInt();
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<n;i++)
			{
				if(a[i]<=k)
				{
					System.out.println(1);
				k=k-a[i];
				}
				else
				{
					System.out.println(0);
				}
			}
		}

	}

}
