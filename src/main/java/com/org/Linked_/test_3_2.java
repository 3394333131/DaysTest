package com.org.Linked_;

import com.org.Linked_.pojo.ListNode;

import java.util.List;

/**
 * 给你链表的头节点,删除倒数第n个节点
 * 快慢指针
 */
public class test_3_2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast !=null){
            fast=fast.next;
            second =second.next;
        }
        second.next =second.next.next;
        ListNode ans = dummy.next;
        return  ans;
    }


}
