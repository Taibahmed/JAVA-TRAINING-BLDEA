package TrainingCodes;

import java.util.Scanner;

public class program30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of movies house:");
		int m=sc.nextInt();
		System.out.println("enter the no of theaters in each movies house:");
		int t=sc.nextInt();
		System.out.println("enter the no of screen in each theaters:");
		int s=sc.nextInt();
		int a[][][] = new int[m][t][s];
		for(int i=0;i<m;i++)
		{ 
			System.out.println("Inside the movie house"+(i+1));
			for(int j=0;j<t;j++)
			{
				System.out.println("Inside the Thearter"+(j+1));
				for(int k=0;k<s;k++)
				{
					System.out.println("Enter the capacity of Screen"+(k+1));
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("----------------------------------");
		for(int i=0;i<m;i++)
		{ 
			System.out.println("Inside the movie house"+(i+1));
			for(int j=0;j<t;j++)
			{
				System.out.println("Inside the Thearter"+(j+1));
				for(int k=0;k<s;k++)
				{
					System.out.println("The Funds that screen"+(k+1)+"provides is :"+(a[i][j][k]*350));
				}
			}
		}
	}

}
