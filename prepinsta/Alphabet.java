package prepinsta;

public class Alphabet 
{
	public static void main(String[] args) 
	{
		char test='a';
		
		//1st way
		if(test>='a'&&test<='z' || test>='A'&&test<='Z')
			System.out.println("Alphabet");
		else
			System.out.println("Not a Alphabet");
		
		//2nd way
		System.out.println(Character.isAlphabetic(test));
		
		//3rd way
		System.out.println(Character.isLetter(test));
	}
}
