package TrainingCodes;

import java.util.Scanner;

public class program31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array element to be searched:");
		int key=sc.nextInt();
		
		int a[]= {10,20,30,40 ,50, 60, 70, 80, 90, 99};
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==key)
				{
					System.out.println("element found in position "+(i+1));
					return;
				}
			}
			System.out.println("Element not found");			
	}

}
