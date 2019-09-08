package com.com.Interview.Java;

/**
 *
 */

public class twoNumSumLeetCode {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode targetListHeadNode=new ListNode(0);
        ListNode xl1=l1,xl2=l2,current=targetListHeadNode;

        while (xl1!=null||xl2!=null){

            int x=xl1!=null?xl1.val:0;
            int y=xl2!=null?xl2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
            if(xl1!=null) xl1=xl1.next;
            if(xl2!=null) xl2=xl2.next;
        }
        if(carry>0){
            current.next=new ListNode(carry);
        }
        return targetListHeadNode.next;
    }
}


