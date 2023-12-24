package prepinsta;

public class typeCasting {
	public static void main(String[] args) {
	
		char c='i';
		int i=c;//implicit typecasting
		System.out.println("=>"+i);//105
		
		char d='A';
		int j=(int)d;//explicit typecasting 
		//(int) is cast operator
		System.out.println(j);
		
		char e='a';
		int k=Character.getNumericValue(e);
		System.out.println(k);
	}
}
