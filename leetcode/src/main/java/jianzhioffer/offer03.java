package jianzhioffer;

/**
 * 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 */


import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * way1: 栈的应用 Stack<Integer> stack = new Stack<Integer>();   import java.util.Stack;
 *
 * way2: 递归.一直放; 递归本身就是一种逆序(第二步需要第一步的支撑)
 *
 * way3：链表倒序：
 *
 * way4：add函数 arraylist.add(0,listnode.val)
 *
 * way5: 链表逆转   三个节点    前一个节点pre 当前节点cur 后面的节点temp
 *                  初始化 pre=null
 *                  whulie（url）{
 *                      //转向
 *                      temp=cur.next;
 *                      cur.next=pre;
 *                      //前移
 *                      pre=cur;
 *                      cur=temp;
 *                  }
 */

  class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
        this.val = val;
    }
}

public class offer03 {
      @Test
    public  void  main() {
          ListNode listNode0 = new ListNode(0);
          ListNode listNode1 = new ListNode(1);
          ListNode listNode2 = new ListNode(2);
          ListNode listNode3 = new ListNode(3);

          listNode0.next = listNode1;
          listNode1.next = listNode2;
          listNode2.next = listNode3;

//        Stack<Integer> stack = new Stack<Integer>();
//        while(listNode0!=null){
//            stack.add(listNode0.val);
//            listNode0=listNode0.next;
//        }
//        ArrayList ints = new ArrayList();
//        int i=0;
//        while(stack.empty()==false){
//            ints.add(stack.pop());
//        }




//        ArrayList list = new ArrayList<Integer>();
//        ArrayList<Integer> function = function(listNode0, list);
//          for(Integer a:function){
//              System.out.println(a);
//          }

          ListNode pre=null;
          ListNode temp;
          while(listNode0!=null){
              temp=listNode0.next;
              listNode0.next=pre;
              pre=listNode0;
              listNode0=temp;
          }
          ArrayList<Integer> integers = new ArrayList<Integer>();
          while(pre!=null){
              integers.add(Integer.valueOf(pre.val));
              pre=pre.next;
          }
          for(Integer a:integers)
          System.out.println(a);


      }

//    ArrayList function(ListNode listNode,ArrayList list){
//        if(listNode==null)
//            return null;
//        function(listNode.next,list);
//        list.add(listNode.val);
//        return list;
//    }



}


