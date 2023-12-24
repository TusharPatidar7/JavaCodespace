package leetCode;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
	Map obj;

	public MyHashMap() {
		obj = new HashMap();
	}

	public void put(int key, int value) {
		if (!obj.containsKey(key)) {
			obj.put(key, value);
		} else {
			obj.replace(key, value);
		}
	}

	public int get(int key) {
		if (obj.containsKey(key)) {
			return (int) obj.get(key);
		} else {
			return -1;
		}
	}

	public void remove(int key) {
		obj.remove(key);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return obj.entrySet().toString();
	}
	public static void main(String[] args) {
		MyHashMap obj = new MyHashMap();
		obj.put(1, 1);

		System.out.println(obj);
		int param2 = obj.get(1);

		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
	}

}
