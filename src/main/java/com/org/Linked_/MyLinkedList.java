package com.org.Linked_;


import com.org.Linked_.pojo.ListNode_1;

class MyLinkedList {
    int size;
    ListNode_1 head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode_1(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode_1 cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        index = Math.max(0, index);
        size++;
        ListNode_1 pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode_1 toAdd = new ListNode_1(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        ListNode_1 pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}



