//Demonstration of Stack
package com.learn;
import java.util.Stack;
public class DemoStack {
	public static void main(String[] args) {
		//stack object
		Stack<Integer> stack=new Stack<Integer>();
		//inserting the elements
		stack.add(120);
		stack.push(130);
		stack.push(140);
		//printing the various stack methods
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.indexOf(130));
		System.out.println(stack.add(175));
		System.out.println(stack);
		

	}

}
