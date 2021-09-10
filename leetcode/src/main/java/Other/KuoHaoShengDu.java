package Other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 一个合法的括号匹配序列有以下定义:
 * 1、空串""是一个合法的括号匹配序列
 * 2、如果"X"和"Y"都是合法的括号匹配序列,"XY"也是一个合法的括号匹配序列
 * 3、如果"X"是一个合法的括号匹配序列,那么"(X)"也是一个合法的括号匹配序列
 * 4、每个合法的括号序列都可以由以上规则生成。
 * 例如: "","()","()()","((()))"都是合法的括号序列
 * 对于一个合法的括号序列我们又有以下定义它的深度:
 * 1、空串""的深度是0
 * 2、如果字符串"X"的深度是x,字符串"Y"的深度是y,那么字符串"XY"的深度为max(x,y) 3、如果"X"的深度是x,那么字符串"(X)"的深度是x+1
 * 例如: "()()()"的深度是1,"((()))"的深度是3。牛牛现在给你一个合法的括号序列,需要你计算出其深度。
 */
public class KuoHaoShengDu {
//    @Test
//    public  void main() {
//        String str = "(((())))(((())))((((()))))(((((())))))";
//        int i = deepLength(str);
//        System.out.println(i);
//    }


//  (  (()) () )  (  ( (()) (()) ) ())
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        String str="( ( (()) (()) ) () )";
//                sc.next();
        StringBuffer stringBuffer = new StringBuffer(str);
        Stack<Character> stack = new Stack<>();
        int max=0;
        int max2=0;


        for(int i=0;i<stringBuffer.length();i++){
            //空栈 深度要重新计算
            if(stack.isEmpty()){
                if(max2<max) {
                    max2 = max;
                }
                max=0;
            }

            if(!stack.isEmpty() && stack.peek()+stringBuffer.charAt(i)==81){
                stack.pop();
                max++;
                continue;
            }
            stack.push(stringBuffer.charAt(i));
        }

        System.out.println(max2);

    }
}
