package collections;

import java.util.Comparator;

public class comparator2 implements Comparator<comparable>
{
	@Override
	public int compare(comparable o1, comparable o2) 
	{
//		return o1.getEmpId()-o2.getEmpId();
//		return o1.getEmpName().compareTo(o2.getEmpName());
		return o1.getEmpDept().compareTo(o2.getEmpDept());
	}
}
