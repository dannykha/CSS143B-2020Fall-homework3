package Problem2;

import java.util.HashMap;



public class SingleLinkedList {
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();
    }

    public SingleLinkedList(SingleLinkedList list) {
        if (list == null) {
            return;
        }

        ListNode p1 = new ListNode();
        head = p1;
        ListNode p2 = list.head.next;

        while (p2 != null) {
            p1.next = new ListNode(p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        size = list.size;
    }


    public int removeAll(int valueToRemove) {
        int count = 0;
        while (head != null && head.val == valueToRemove) {
            head = head.next;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == valueToRemove) {
                current.next = current.next.next;
                count++;
                size--;
            }
            else {
                current = current.next;
            }
        }
        return count;
    }

    public void reverse() {
        ListNode previous = null;
        ListNode current = head.next;
        while (current != null)
        {
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        head.next = previous;
    }

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
