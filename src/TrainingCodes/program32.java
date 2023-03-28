package TrainingCodes;

import java.util.Scanner;

public class program32 {
	public static int linear(int a[],int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array element to be searched:");
		int key=sc.nextInt();
		
		int a[]= {10,20,30,40 ,50, 60, 70, 80, 90, 99};
		int res=linear(a,key);
		if(res>0)
		{
			System.out.println("element found in position "+(res+1));	
		}
		else
		{
			System.out.println("element not found");
		}
	}

}