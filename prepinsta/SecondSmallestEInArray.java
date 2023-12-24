package prepinsta;

public class SecondSmallestEInArray {

	public static void main(String[] args) {
	
		int[] array = {10,28,2,3,6,5};
		System.out.println(SecondSmallestEInArray.get(array));
	}

	static int get(int[] array) {
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if(first > array[i]) {
				second = first;
				first = array[i];
			}
			else if(second>array[i]) {
				second = array[i];
			}
		}
		return second;
		
	}
}
