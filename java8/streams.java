package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {


	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(35);
		marks.add(50);
		marks.add(85);
//		System.out.println(marks);
		Stream<Integer> s  = marks.stream();
//		List<?> updatedMarks = s.map(i->i+5).collect(Collectors.toList());
//		System.out.println(updatedMarks);
		
		int min = s.min((i1,i2)->i2.compareTo(i1)).get();
//		System.out.println(min);
		
		String[] name = {"1Maa Shelputri", "2Maa Brahmacharini", "3Maa Chandraghata", "4Maa Kushmanda", "5Maa Skandmata","6Maa katyayni",
				"7Maa Kalratri", "8Maa Mahagauri", "9Maa Shidhidatri"};
		Stream<String> ss = Stream.of(name);
		
//		List<String> l = Stream.of(name).filter(ar->ar.startsWith("7")||ar.startsWith("8")||ar.startsWith("9")).collect(Collectors.toList());
//		System.out.println(l);
//		
		Stream<String> s3 = ss.map(a->a.charAt(0)+"- "+a.substring(1));
		System.out.println();
		
		System.out.println(s3.sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList()));
	}
}
