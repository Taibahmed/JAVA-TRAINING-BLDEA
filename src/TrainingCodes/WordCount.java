package TrainingCodes;
import java.util.Scanner;
public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be inserted :");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')&&(i>0)||((str.charAt(i)!=' ')&&i==0))
			{
				count++;
			}
		}
		System.out.println("The no of words in the string is: "+count);
	}

}
