package oops;

import java.util.Comparator;

public class Emp_Comparator implements Comparator<Emp>
{
	public int compare(Emp o1,Emp o2) {
		return (int)(o1.empSal-o2.empSal);
	}
}
