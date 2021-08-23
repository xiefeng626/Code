package jianzhioffer;

import jianzhioffer.util.ListNode;

public class Offer15 {
    ListNode  revertListNode(ListNode head){
        ListNode pre=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=pre;
            pre = head;
            head=temp;
        }
        return pre;
    }
}

