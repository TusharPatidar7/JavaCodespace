package prepinsta;

import java.util.Comparator;

public class emp_comparator implements Comparator<emp>
{

	@Override
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		return (int)(o1.salary-o2.salary);
	}
	
}
