package prepinsta.String;

public class Length {

	public static void main(String[] args) {
		String s = "patidar";
		int count = 0;
		
		for (char c : s.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}

}
