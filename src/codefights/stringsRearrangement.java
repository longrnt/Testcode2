package codefights;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class stringsRearrangement {
	public static void main(String[] args) {
		String[] inputArray = {"ab", "cb", "aa"};
		System.out.println(stringsRearrangement(inputArray));
		for (String item : inputArray) {
			System.out.println(item);
			
		}
	}
	
	public static boolean stringsRearrangement(String[] inputArray) {
		//Sort all char in each string
		for (int i=0; i < inputArray.length; ++i) {
			String temp = inputArray[i];
			char[] chars = temp.toCharArray();
			Arrays.sort(chars);
			inputArray[i] = new String(chars);
		}
		/*
		 * boolean solve(Node n) {
			    put node n on the stack;
			    while the stack is not empty {
			        if the node at the top of the stack is a leaf {
			            if it is a goal node, return true
			            else pop it off the stack
			        }
			        else {
			            if the node at the top of the stack has untriedQueue children
			                push the next untriedQueue child onto the stack
			            else pop the node off the stack
			
			    	}
			    return false
			}
		 */
		Stack<String> stack = new Stack<>();
		Queue<Integer> triedQueue = new ConcurrentLinkedQueue<Integer>();
		
		//{"ab", "bc", "aa"}
		for (int i = 0; i< inputArray.length; ++i) {
			String item = inputArray[i];
			stack.push(item);
			while (!stack.empty()) {
				//if the node at the top of the stack is a leaf
				if (stack.size() == 1) {
					String peek = stack.peek();
					for (int j = 0; j < inputArray.length; ++j) {
						//Check differ 1 char
						int differ = 0;
						String temp = inputArray[j];
						if (!peek.equals(temp) 
								&& !inputArray[triedQueue.peek()].equals(temp)) {
							for (int k = 0; k < temp.length(); ++k) {
								if (temp.charAt(k) != peek.charAt(k)) {
									++differ;
								}
								if (differ == 2) {
									break;
								}
							}
							if (differ == 1) {
								//return ok node
								triedQueue.add(i);
//								stack.push(temp);
							} else {
								//else pop it off the stack
								stack.pop();
							}
						}
					}
				} else {
					if (!triedQueue.isEmpty()) {
						int peek = triedQueue.poll();
						stack.push(inputArray[peek + 1]);
					} else {
						stack.pop();
					}
				}
			}
		}
		return false;
	}

}
