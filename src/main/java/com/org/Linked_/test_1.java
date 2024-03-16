package com.org.Linked_;

import com.org.Linked_.pojo.ListNode_1;

public class test_1 {
    public ListNode_1 removeElements(ListNode_1 head, int val) {
        ListNode_1 headNode = new ListNode_1(0);
        headNode.next =head;
        ListNode_1 temp = headNode;
        while (temp.next!=null){
            if (temp.next.val ==val){
                temp.next = temp.next.next;
            }else {
                temp =temp.next;
            }
        }
        return headNode.next;
    }
}

