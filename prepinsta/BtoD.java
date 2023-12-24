package prepinsta;

public class BtoD 
{
	void Cal(String b)
	{
		int d=0;
		
		System.out.println("Binary : "+b);
		for(int i=b.length()-1,j=0; i>=0; i--) {
			if(b.charAt(j++)=='1') {
				d += Math.pow(2, i);
			}
		}
		System.out.println("Decimal : "+d);
	}
	void CalBin(int m)
	{
		int n=0,o=0,m1=m;
		System.out.println("\nDecimal : "+m);
		while(m>0)
		{
			n=n*10+(m%2);
			m/=2;
		}
		while(n>0)
		{
			o=o*10+(n%10);
			n/=10;
		}
		if(m1%2==0)
		{
			o=o*10+(0);
		}
		System.out.println("Binary : "+o);
	}
	public static void main(String[] args) {
		String n="1011";
		BtoD obj=new BtoD();
		obj.Cal(n);
		obj.CalBin(10);
	}

}
