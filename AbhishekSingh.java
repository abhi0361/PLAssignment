import java.util.*;
import java.*;
class AbhishekSingh
{
	public static void main(String args[])
	{
		String s;
		String p="";
		int j=0, counter=0;
		System.out.println("Enter the String:");
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		while(j<s.length())                 //for comparing each charcters of the string 
		{
			for(int i=0;i<s.length();i++)
			{
		
				char c=s.charAt(i);  // For each iteration, character of the string is kept in c and d temporarily for comparison
				char d=s.charAt(j);
				if(i<j&&d==c)     
				{
					break;	   //comes out of the loop when it recompares already checked character
				}
				if(d==c)
				{
					counter++;  //counter is used to count the recurrence
				}

			} 
			if(counter>=1)
			{
				System.out.println("Number of times " +s.substring(j,j+1)+" occured is "+counter);
			}
			j++;
			counter=0;	             //counter is reset for each character
		}
	
		//From here the code to capitalize the alternate character is written
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);			//one by one for each iteration, character of the string is kept in c temporarily for comparison.
				if(i%2==0)
				{
					p=p+Character.toUpperCase(c);	//one by one concatanated into the new string p after changing to Capital
				}
				else
				{
					p=p+c;				//one by one concatanated into the new string p without changing
				}
			}
	System.out.println("Alternate character capitalization of the String: "+p);
	
	}
}