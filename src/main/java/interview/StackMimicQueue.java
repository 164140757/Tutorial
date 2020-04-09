package interview;

import java.util.Stack;

public class StackMimicQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }
    public int pop() throws Exception {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new Exception("no element is in the stack.");
        }
        return stack2.pop();
    }

    public static void main(String[] args) throws Exception {
        StackMimicQueue stackMimicQueue = new StackMimicQueue();
        stackMimicQueue.push(5);
        stackMimicQueue.push(4);
        stackMimicQueue.push(3);
        System.out.print(stackMimicQueue.pop());
        System.out.print(stackMimicQueue.pop());
        System.out.print(stackMimicQueue.pop());

    }
}
