package Collections_Generics;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		s.push(10);
		s.push(30);
		s.push(2);
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.search(10));
		
		System.out.println(s.isEmpty());
		
	}

}
