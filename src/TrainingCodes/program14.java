package TrainingCodes;

import java.util.Scanner;

public class program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        { 
        	int k=i;
        	for(int j=1;j<=n;j++)
        	{
        		System.out.print(k+"  ");
        		k=k+5;
        	}
        	System.out.println();
        }
	}

}
