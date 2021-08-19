package jianzhioffer;

import jianzhioffer.util.ListNode;
import org.junit.Test;

/**
 * 输入一个链表，输出一个链表，该输出链表包含原链表中从倒数第k个结点至尾节点的全部节点。
 * 如果该链表长度小于k，请返回一个长度为 0 的链表。
 *
 *
 * 输入：
 * {1,2,3,4,5},1
 * 返回值：{5}
 *
 */
public class Offer14 {

    @Test
    public void main(){
        ListNode list= new ListNode(1);
        ListNode List2=list.next=new ListNode(2);
        ListNode List3=List2.next=new ListNode(3);
        ListNode List4=List3.next=new ListNode(4);
        ListNode List5=List4.next=new ListNode(5);
        ListNode List6=List5.next=new ListNode(6);
        FindKthToTail(list,1);
    }

    //双指针法
    public ListNode FindKthToTail2 (ListNode pHead, int k){
        ListNode head=pHead;
        for(int i=0 ;i<k;i++){
            if(pHead!=null) pHead= pHead.next;
            else
                return null;
        }
        while(pHead!=null){
            pHead=pHead.next;
            head=head.next;
        }
        return head;


    }

    //self function
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        int length=0;
        ListNode head=pHead;
        while(pHead!=null){
            length++;
            pHead=pHead.next;
        }
        if(k>length){
            return null;
        }
        int i = length+1 - k;
        int j=0;
        while(head.next!=null){
            j++;
            if(j==i+1){
                return head;
            }
            head=head.next;
        }
        return null;


    }
}
