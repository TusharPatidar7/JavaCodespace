package prepinsta.Arrays;

import java.util.HashMap;

public class ElementsFrequency {

	public static void main(String[] args) {
		int arr[] = {10,20,30,10,20,30,30,40};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	
		
		for(int i=0; i<arr.length-1; i++) {
			if(map.containsKey(arr[i]))
			map.put(arr[i],map.get(arr[i])+1);
			else
			map.put(arr[i], 1);
		}
		map.forEach((k, v)->System.out.println(k+" : "+v));
	}

}
