class Anagram
{
	public static void main(String args[])
	{
		if(args.length!=2)
		{
			System.out.println("Too few arguments:");
			System.out.println("i.e.java Anagram <String1> <string2>");
		}
		String first = args[0];
		String second = args[1];
		int a1[] = new int[127];
		int a2[] = new int[127];
		int flag = 0;
		if(first.length() != second.length())
		{
			System.out.println("strings are not anagram.");
		}
		else
		{
			for(int i=0;i<first.length();i++)
			{
			   a1[first.codePointAt(i)]++;
			}
			for(int j=0;j<second.length();j++)
			{
				a2[second.codePointAt(j)]++;
			}
			int stringLength = a1.length;
			for(int i=0;i<stringLength;i++)
			{
				if(a1[i] == a2[i])
				{
					 flag = 1;
					
				}
				else
				{
					flag=0;
					break;
				}
			}
			if(flag == 1)
			{
				System.out.println("strings are anagram.");
			}
			else
			{
				System.out.println("strings are not anagram.");
			}
		}
	}
	
	
}