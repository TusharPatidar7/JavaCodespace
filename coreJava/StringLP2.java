package coreJava;

public class StringLP2 {
	public String doubleChar(String str) {
		String arr = "";
		for (int i = 0; i < str.length(); i = i + 1) {
			arr += str.charAt(i);
			arr += str.charAt(i);
		}
		return arr;
	}

	public boolean frontAgain(String str) {
		String arr = str.substring(str.length() - 2);
		return arr.equals(str.substring(0, 2));
	}

	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'h') {
				if (str.charAt(++i) == 'i')
					count++;
			}
		}
		return count;
	}

	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e')// 0,3
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		StringLP2 obj = new StringLP2();
		// String s = obj.doubleChar("HEY");
		// System.err.println(s);
		// System.out.println(obj.frontAgain("ed"));
		// System.out.println(obj.countHi("hiabchi hi hi ih hi"));
		// System.out.println(obj.countCode("codekjbhefkcojebvcoqe"));

	}
}
