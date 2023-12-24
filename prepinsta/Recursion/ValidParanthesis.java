package prepinsta.Recursion;

import java.util.Stack;

public class ValidParanthesis {
	
	    public boolean isValid(String s) {
				if(s.length()%2!=0) return false;
			Stack<Character> stack = new Stack<Character>();


			for (char c : s.toCharArray()) {
				if(!stack.isEmpty()){
				if (c == '}' && stack.peek() == '{') {
					stack.pop();
					continue;
				}
				if (c == ')' && stack.peek() == '(') {
					stack.pop();
					continue;
				}
				if (c == ']' && stack.peek() == '[') {
					stack.pop();
					continue;
				}
				}
				stack.push(c);
			}
			System.out.println(stack);
			if (stack.isEmpty())
				return true;
			return false;
		}
	
	public static void main(String[] args) {
		boolean ans = new ValidParanthesis().isValid("]})");
		System.out.println(ans);
	}
}
