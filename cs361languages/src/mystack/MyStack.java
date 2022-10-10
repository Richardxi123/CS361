/**
 * 
 */
package mystack;

/**
 * @author Xi Zhu
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		return null;
	}

	public void push(T v) {
		// TODO To complete
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> stack = new MyStack<Integer>();
		
		// Push 1 and 2
		stack.push(1);
		stack.push(2);
		
		// Pop
		stack.pop();
		
		// Push 5
		stack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		
		MyStack<Person> person = new MyStack<Person>();
		person.push(new Person("Xi", "Zhu"));
		person.push(new Person("Christelle", "Scharff"));
		
	}

}
