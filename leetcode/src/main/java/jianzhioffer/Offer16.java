package jianzhioffer;

import jianzhioffer.util.ListNode;
import org.junit.Test;

import java.util.List;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Offer16 {
    @Test
    public void main(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2=listNode1.next=new ListNode(3);
        ListNode listNode3=listNode2.next=new ListNode(4);
//        ListNode listNode4=listNode3.next=new ListNode(4);
//        ListNode listNode5=listNode4.next=new ListNode(5);

        ListNode listNodeA1 = new ListNode(2);
        ListNode listNodeA2=listNodeA1.next=new ListNode(4);
        ListNode listNodeA3=listNodeA2.next=new ListNode(6);
//        ListNode listNodeA4=listNodeA3.next=new ListNode(4);
//        ListNode listNodeA5=listNodeA4.next=new ListNode(5);
        ListNode merge = Merge2(listNode1, listNodeA1);
        while (merge!=null){
            int val = merge.val;
            System.out.println(val);
            merge=merge.next;
        }


    }

    /**
     * 递归方法
     * 链表不同于数组 仔细思考
     * @param list1
     * @param list2
     * @return
     */
    ListNode Merge2(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;

        if(list1.val<list2.val){
            list1.next=Merge2(list1.next,list2);
            return list1;
        }else{
            list2.next=Merge2(list1,list2.next);
            return list2;
        }

    }



    /**
     * 非递归方法
     * @param list1
     * @param list2
     * @return
     */
    ListNode Merge(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        while(list1!=null || list2!=null){
            if(list1==null)
            {
                head=head.next=list2;
                break;
            }
            if(list2==null){
                head=head.next=list1;
                break;
            }


            if(list1.val<list2.val)
            {
                head=head.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else
            {
                head=head.next=new ListNode(list2.val);
                list2=list2.next;
            }
        }
        return listNode.next;
    }
}
