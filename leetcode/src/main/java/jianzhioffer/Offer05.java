package jianzhioffer;

import org.junit.Test;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。
 * 队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。
 */
public class Offer05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    @Test
    public void main() {
        push(1);
        push(2);
        push(3);
        pop();
        pop();
        push(4);
        pop();
        push(5);
        pop();
        pop();



    }

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
//        int size = stack1.size();
//        for(int i=0;i<size-1;i++){
//            stack2.push(stack1.pop());
//        }
//        Integer pop = stack1.pop();
//        for(int j=0;j<stack2.size();j++){
//            stack1.push(stack2.pop());
//        }
//        System.out.println(pop);
//        return pop;
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }


        }
        return stack2.pop();
    }
}
