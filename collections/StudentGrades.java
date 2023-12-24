package collections;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {

	public static Map<String, Integer> getfinalGradeGrade() {
		HashMap<String, Integer> grade = new HashMap<String, Integer>();
		grade.put("Harsh", 90);
		grade.put("Raja", 99);
		grade.put("Naresh", 33);
		grade.put("Rohit", 77);
		grade.put("Pawan", 50);
		grade.put("Sawan", 40);
		grade.put("Dilip", 70);
		grade.put("Vivek", 60);
		grade.put("Sourabh", 50);
		grade.put("Damru", 80);
		
		return grade;
	}
	
	public static Map<String, Integer> getMakeUpGrade() {
		HashMap<String, Integer> grade = new HashMap<String, Integer>();
		grade.put("Harsh", 95);
		grade.put("Raja", 59);
		grade.put("Naresh", 73);
		grade.put("Rohit", 87);
		grade.put("Pawan", 70);
		grade.put("Sawan", 80);
		grade.put("Dilip", 50);
		grade.put("Vivek", 90);
		grade.put("Sourabh", 88);
		grade.put("Damru", 86);
		
		return grade;
	}
	 
	
	public static void main(String[] args) {
		Map<String, Integer> finalGrade = StudentGrades.getfinalGradeGrade();
		Map<String, Integer> makeUp = StudentGrades.getMakeUpGrade();
		
		finalGrade.forEach((k, v) -> {
			finalGrade.put(k, (v>makeUp.get(k))?v:makeUp.get(k));
		});
		finalGrade.forEach((k,v)->System.out.println(k+":"+v));
	}

}
