package jianzhioffer;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数，
 * 并且调用 min函数、push函数 及 pop函数 的时间复杂度都是 O(1)
 * push(value):将value压入栈中
 * pop():弹出栈顶元素
 * top():获取栈顶元素
 * min():获取栈中最小元素
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

/**
 * 示例:
 * 输入:    ["PSH-1","PSH2","MIN","TOP","POP","PSH1","TOP","MIN"]
 * 输出:    -1,2,1,-1
 * 解析:
 * "PSH-1"表示将-1压入栈中，栈中元素为-1
 * "PSH2"表示将2压入栈中，栈中元素为2，-1
 * “MIN”表示获取此时栈中最小元素==>返回-1
 * "TOP"表示获取栈顶元素==>返回2
 * "POP"表示弹出栈顶元素，弹出2，栈中元素为-1
 * "PSH-1"表示将1压入栈中，栈中元素为1，-1
 * "TOP"表示获取栈顶元素==>返回1
 * “MIN”表示获取此时栈中最小元素==>返回-1
 */

public class Offer20 {
    @Test
    public  void main() {
        push(-1);
        push(2);
        System.out.println(min());
        top();
        pop();
        push(1);
        top();
        System.out.println(min());
    }

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>(); //最小堆栈
    public void push(int node) {
        stack.push(node);
        if(minStack.empty() || node <= minStack.peek()){
            minStack.push(node);
        }
    }

    public void pop() {
        if(stack.pop().equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();

    }

    public int min() {
        return minStack.peek();
    }

    //我的垃圾代码
//    Stack<Integer> in = new Stack<Integer>();
//
//    public void push(int node) {
//        in.push(node);
//    }
//
//    public void pop() {
//        if(in.size()==0)
//            return;
//        in.pop();
//    }
//
//    public int top() {
//        return in.peek();
//    }
//
//    public int min() {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        int j=0;
//        while(in.size()>j){
//            arrayList.add(in.get(j++));
//        }
//        for(int i=1;i<arrayList.size();i++){
//            if(arrayList.get(0) >arrayList.get(i)){
//                int temp = arrayList.get(i);
//                arrayList.set(i,arrayList.get(0));
//                arrayList.set(0,temp);
//            }
//        }
//        return arrayList.get(0);
//    }
}
