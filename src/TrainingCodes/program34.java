package TrainingCodes;

import java.util.Arrays;

public class program34 {

	public static void main(String[] args) {
		int a[]= {10,7,8,4,9,5,2,1,6,3};
		int b[]= {5,2,1,6,3,10,7,8,4,9};
       Arrays.sort(a);
       Arrays.sort(b);
        if(a.length==b.length)
        {
        	for(int i=0;i<a.length;i++)
        	{
        		if(a[i]!=b[i])
        		{
        			System.out.println("Arrays are not equal");
        			System.exit(0);
        		}
        	}
        	System.out.println("Arrays are equal");
        }
        else
        {
        	System.out.println("Arrays are not equal");
        }
	}

}
