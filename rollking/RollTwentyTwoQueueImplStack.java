package rollking;

import java.util.Queue;
import java.util.LinkedList;
public class RollTwentyTwoQueueImplStack {
    public static void main(String[] args) {
        RollTwentyTwoQueueImplStack stack = new RollTwentyTwoQueueImplStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
    }
    Queue<Integer> inQueue = null;
    Queue<Integer> outQueue = null;

    public RollTwentyTwoQueueImplStack() {
        //入栈队列
        inQueue = new LinkedList();
        //出栈队列
        outQueue = new LinkedList();
    }

    public void push(int x) {
        //入栈队列入元素
        inQueue.add(x);
        //把出栈队列也入入栈队列里
        while(!outQueue.isEmpty()){
            inQueue.add(outQueue.poll());
        }
        //出栈队列变入栈队列，入栈队列变出栈队列;因为出栈队列空了，等价于新队列
        outQueue = inQueue;
        inQueue = new LinkedList<Integer>();
        // Queue<Integer> temp = outQueue;
        // outQueue = inQueue;
        // inQueue = temp;
    }

    public int pop() {
        return outQueue.poll();
    }

    public int top() {
        return outQueue.peek();
    }

    public boolean empty() {
        return outQueue.isEmpty();
    }
}
