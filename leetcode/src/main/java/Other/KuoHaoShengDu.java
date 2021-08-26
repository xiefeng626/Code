package Other;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

//    public static void main(String[] args) throws IOException {
////        Scanner sc = new Scanner(System.in);
////        String str=sc.next();
////        StringBuffer stringBuffer = new StringBuffer(str);
//        Stack<Character> stack = new Stack<>();
//        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
//        String s = bfr.readLine().trim();
//        Stack<Character> st = new Stack();
//        char[] chars = s.toCharArray();
//        int temp=0;
//        int max=0;
//
//
//        for(int i=0;i<stringBuffer.length();i++){
//            //符合条件出栈
//            if(!stack.isEmpty() && stack.peek()+stringBuffer.charAt(i)==81){
//                stack.pop();
//                temp--;
//                continue;
//            }
//            stack.push(stringBuffer.charAt(i));
//            temp++;
//            max = max<temp? temp:max;
//        }
//        System.out.println(max);
//
//    }


    //进去一个加一去掉一个减一
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String s = bfr.readLine().trim();
        Stack<Character> st = new Stack();
        char[] chars = s.toCharArray();
        int max=0;
        int temp =0;
        for(int i=0;i<chars.length;i++){
            if('('==chars[i]){
                st.push(')');
                temp++;
            }else{
                st.pop();
                temp--;
            }
            max=max>temp?max:temp;
        }
        System.out.println(max);
    }
}
