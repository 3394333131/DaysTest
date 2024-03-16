package com.org.Linked_;

import com.org.Linked_.pojo.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给你链表的头节点,删除倒数第n个节点
 * 用栈 ,先把全部数据压入栈,再一次弹出n个
 *      然后再弹出一个prev,用prev把目标删掉,并返回实现定义好的dummy的next节点
 */
public class test_3_1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode cur = dummy;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; ++i) {
            stack.pop();
        }
        ListNode prev = stack.peek(); // 获取栈顶元素
        prev.next = prev.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
