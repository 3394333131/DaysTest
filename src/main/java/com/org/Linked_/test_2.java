package com.org.Linked_;

import com.org.Linked_.pojo.ListNode;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表 206
 */
public class test_2 {
    /**
     * 双指针
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode reverseList_1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList_1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
}
