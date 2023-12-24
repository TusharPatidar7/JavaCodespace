package prepinsta;

public class BinaryToDec {
	public static void main(String[] args) {
		String bin = "1111";
		int dec = 0;
		for(int i=bin.length()-1,j=0; i>=0; i--) {
			if(bin.charAt(j++)=='1') {
				dec += Math.pow(2, i);
			}
		}
		System.out.println(dec);
	}
}
