package TrainingCodes;

import java.util.Scanner;

public class program29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of classes:");
		int c=sc.nextInt();
		System.out.println("enter the no of students in class:");
		int s=sc.nextInt();
		int a[][] = new int[c][s];
		for(int i=0;i<c;i++)
		{ 
			
			System.out.println("Inside the class"+(i+1));
			for(int j=0;j<s;j++)
			{
				System.out.println("Enter the marks of the student"+(j+1));
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("----------------------------------");
		for(int i=0;i<c;i++)
		{
			System.out.println("Inside the class"+(i+1));
			for(int j=0;j<s;j++)
			{
				System.out.println("the marks of the student"+(j+1)+"is :"+a[i][j]);

			}
			System.out.println("----------------------------------");
		}
	}

}
