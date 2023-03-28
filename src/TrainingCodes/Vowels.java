package TrainingCodes;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be inserted :");
		String str1=sc.nextLine();
		String str=str1.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
			   str=str.replace(str.charAt(i), '@');
			}
		}
		System.out.println("the string is:"+str);
	}

}