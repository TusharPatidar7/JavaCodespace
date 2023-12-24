package prepinsta;

import java.util.Arrays;

public abstract class Abst 
{
	protected abstract void meth3();
	Abst()
	{
		System.out.println("Constructor");
		this.meth1();
	}
	private void meth1()
	{
		System.out.println("private method");
	}
	static final void meth2()
	{
		System.out.println("static method");
		
		//Program to Check if a string is a valid shuffle of two distinct strings :
		String s="abcdefgh";
		String t1="abcdefg";
		String t2="h";
		
		
		char[] sChars = s.toCharArray();
        char[] t1Chars = t1.toCharArray();
        char[] t2Chars = t2.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(t1Chars);
        Arrays.sort(t2Chars);
        
        char[] merged = new char[t1Chars.length + t2Chars.length];
		
		if(s.length()!=(t1.length()+t2.length()))
		{
			System.out.println("Invalid");
		}
		else
		{
			int a=0,b=0;
			for(int i=0;i<sChars.length;i++)
			{
				if(b>=t2Chars.length || (a < t1Chars.length && t1Chars[a]<=t2Chars[b]))
				{   merged[i]=t1Chars[a];
					a++;
				}
				else
				{
					merged[i]=t2Chars[b];
					b++;
				}
			}
		}
		if(Arrays.equals(sChars, merged))
			System.out.println(true);
		else
			System.out.println(false);
		
	}
	public static void main(String[] args) {
		Abst.meth2();
	}

}
