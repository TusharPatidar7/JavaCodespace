package java8;

import java.util.function.*;

class Student{
	int marks;
	String name;
	Student(String name, int marks){
		this.name=name;
		this.marks=marks;
	}
}

public class functFI {

	public static void main(String[] args) {
//		java.util.function.Function<Integer, Integer> f = i->i*i;
//		System.out.println(f.apply(4));
		
//		Function<String, Integer> f2 = s->s.length();
//		System.out.println(f2.apply("Hello"));
		
		Function<Student, String> fs = s->{
			int marks  = s.marks;
			String grade="";
			if(marks>=80) grade="A";
			else if(marks>=60) grade="B";
			else if(marks>=50) grade="C";
			else if(marks>=35) grade="D";
			else grade="E[Failed]";
			return grade;
		};
		
		Predicate<Integer> p = i->i>=60; 
		
		Student[] s = {	new Student("Durga",66),
						new Student("Naresh", 88),
						new Student("Chinny",30)
		};
		
		Consumer<Student> c = o->{
			System.out.println(o.name);
			System.out.println(o.marks);
			System.out.println(fs.apply(o)+"\n");
		};
		for(Student o: s) {
			if(p.test(o.marks)) {
				c.accept(o);
			}
		}
	}

}
