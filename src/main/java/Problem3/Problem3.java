package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {

    public static void printListInReverse(ListNode list, PrintStream print) {
        LinkedListStack<ListNode> stack = new LinkedListStack<>();
        //storing list into stack
        ListNode ptr = list.next;
        while (ptr != null) { // first loop to go through and put all the stuff into list
            stack.push(ptr);
            ptr = ptr.next;
        }
        // print out da data
        while (stack.size() > 0) {
            print.println(stack.peek().val);
            stack.pop();
        }
    }
}
