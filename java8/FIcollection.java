package java8;

import java.util.ArrayList;
import java.util.Collections;

//class MyComparator implements Comparator<Integer>{
//
//	public int compare(Integer o1, Integer o2) {
//		
//		return (o1<o2)? +1:(o1>o2)?-1:0;//ternary operator
//		
////		if(o1<o2) {
////			return +1;
////		}else if(o1>o2) {
////			return -1;
////		}else {
////			return 0;
////		}
//	}
//}

class EmployeeNew
{
	String name;
	int eno;
	EmployeeNew(String name, int eno){
		this.eno = eno ;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" : "+eno;
	}
}

public class FIcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(10);
//		al.add(25);
//		al.add(30);
//		al.add(0);
//		System.out.println(al);
		
//		Collections.sort(al, new MyComparator());
		
		//Providing implementation of compare() present in Comparator interface.
		//to sort list in descending order.
//		
//		Comparator<Integer> c = (o1,o2)->(o1<o2)? +1:(o1>o2)?-1:0;
//		Collections.sort(al, c);
//		
////		Collections.sort(al);//for Ascending order
//		System.out.println(al);
		
		ArrayList<EmployeeNew>  l = new ArrayList<EmployeeNew>();
		l.add(new EmployeeNew("Dhoni",07));
		l.add(new EmployeeNew("Kohli",18));
		l.add(new EmployeeNew("Yuvraj",12));
		l.add(new EmployeeNew("Rohit",45));
		System.out.println(l);
//		Comparator<EmployeeNew> c = ((e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
//		Collections.sort(l,c);
		
		Collections.sort(l,(o1,o2)->o1.name.compareTo(o2.name));
		System.out.println(l);
	}

}
