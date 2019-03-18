package effective.java;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop() {
		if (size == 0) 
			throw new EmptyStackException();
		return elements[--size];
	}
	
	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
//		stack.push(new Integer(123));
//		stack.push(new Integer(456));
//		stack.push(new Integer(789));
//
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());

		while (true) {
			stack.push(new Integer(1));
			stack.push(new Integer(2));
			stack.push(new Integer(3));
			stack.push(new Integer(4));
			stack.push(new Integer(5));
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		}
	}
}
