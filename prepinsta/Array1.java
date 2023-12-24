package prepinsta;

public class Array1 
{	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int a=3;
	
			if(findEle(arr,a))
			{
				System.out.println("Found element");
			}
			else
				System.out.println("Element Not found");
	}
	static boolean findEle(int ar[],int value)
	{
		for(int e:ar)
		{
			if(value==e)
				return true;
		}
		return false;
	}

}
