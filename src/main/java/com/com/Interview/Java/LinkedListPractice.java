//package com.com.Interview.Java;
//
//
//
//public class LinkedListPractice {
//
//    ListNode head =null;
//    //添加节点
//    public ListNode addNode(ListNode targetList,int date){
//        ListNode newDate=new ListNode(date);
//        if(targetList==null)
//        {
//            targetList=newDate;
//            return targetList;
//        }
//       ListNode temp=new ListNode(date);
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=newDate;
//        return targetList;
//    }
//
//    //遍历链表
//    public  int traversalList(ListNode targat){
//
//        int listValue=0;
//        int i=0;
//        while (targat!=null){
//           listValue+=(targat.date)*(Math.pow(10,i));
//            targat=targat.next;
//            i++;
//        }
//        return listValue;
//    }
//
//    //获得每一位并存入链表中
//    public int getAllNum(ListNode finalList,int num){
//        if (num==0){
//            return 0;
//        }
//        else {
//            int theValue=num%10;
//            addNode(finalList,theValue);
//            num=num/10;
//            getAllNum(finalList,num);
//        }
//        return 0;
//    }
//    //链表之和
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int numValue=traversalList(l1)+traversalList(l2);
//        ListNode finalList=null;
//        getAllNum(finalList,numValue);
//        return finalList;
//    }
//}

//创建链表
//class ListNode{
//    ListNode next=null;
//    int  date;
//    public ListNode(int date){
//        this.date=date;
//    }
//}
//需要再自己实现下