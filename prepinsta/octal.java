package prepinsta;

public class octal
{
	void toOctal(String bi)
	{
		String oc="";
		while(bi.length()%3!=0)
		{
			bi="0"+bi;
		}
		for(int i=0;i<bi.length();i+=3)
		{
			int decimal = Integer.parseInt(bi.substring(i, i + 3), 2);
            oc += Integer.toString(decimal);
		}
		System.out.println(oc);
	}
	void toBinary(String oc)
	{
		String bi="";
		for(int i=0;i<oc.length();i++)
		{
			int decimal = Integer.parseInt(Character.toString(oc.charAt(i)));
	        bi += Integer.toBinaryString(decimal);
	    }
		System.out.println(bi);
	}
	public static void main(String[] args) {
		octal o=new octal();
		o.toOctal("110101");
		o.toBinary("65");
	}

}
