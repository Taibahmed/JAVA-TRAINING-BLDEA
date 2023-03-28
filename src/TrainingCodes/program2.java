package TrainingCodes;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<18)
		{
			System.out.println("you are young");
		}
		else if(age>65)
		{
			System.out.println("you are old");
		}
		else
		{
			System.out.println("you are perfect for marrage");
		}
	}

}
