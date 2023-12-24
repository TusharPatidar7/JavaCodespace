package dsaPractiseArrays;

public class RemoveAllOccurrence {

	public static void main(String[] args) {

		String ans = new RemoveAllOccurrence()
				.removeOccurrences("axxxxyyyyb", "xy");
		System.out.println(ans);

	}

	public String removeOccurrences(String s, String part) {

		int count1[] = new int[26];
		for (int i = 0; i < part.length(); i++) {
			int index = part.charAt(i) - 'a';
			count1[index]++;
		}

		int windowSize = part.length();
		int i = 0;
		int count2[] = new int[26];

		while (i < windowSize && i < s.length()) {
			int index = s.charAt(i) - 'a';
			count2[index]++;
			i++;
		}

		if (checkEqual(count1, count2)) {
			String s1 = remove(s, i - windowSize, i);
			s = removeOccurrences(s1, part);
		}

		while (i < s.length()) {
			int index = s.charAt(i) - 'a';
			count2[index]++;

			int old = s.charAt(i - windowSize);
			index = old - 'a';
			count2[index]--;

			i++;

			if (checkEqual(count1, count2)) {
				String s1 = remove(s, i - windowSize, i);
				s = removeOccurrences(s1, part);
			}
		}

		return s;
	}

	boolean checkEqual(int[] a, int[] b) {
		for (int i = 0; i < 26; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	String remove(String s, int first, int last) {
//		System.out.println(s.substring(first, last));
		return s.substring(0, first) + s.substring(last);
	}
}
