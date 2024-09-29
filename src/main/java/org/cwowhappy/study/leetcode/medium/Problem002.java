package org.cwowhappy.study.leetcode.medium;

/**
 * 考察内容：链表的操作
 */
public class Problem002 {
    public static void main(String[] args) {

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carryVal = 0;
            ListNode curListNode1, curListNode2, resultList, curResultListNode;
            resultList = curResultListNode = new ListNode(0);
            for (curListNode1 = l1, curListNode2 = l2;
                 curListNode1 != null && curListNode2 != null;
                 curListNode1 = curListNode1.next, curListNode2 = curListNode2.next) {
                 int tmpVal = curListNode1.val + curListNode2.val + carryVal;
                 carryVal = tmpVal / 10;
                 curResultListNode.next = new ListNode(tmpVal % 10);
                 curResultListNode = curResultListNode.next;
            }
            for (; curListNode1 != null; curListNode1 = curListNode1.next) {
                int tmpVal = curListNode1.val + carryVal;
                carryVal = tmpVal / 10;
                curResultListNode.next = new ListNode(tmpVal % 10);
                curResultListNode = curResultListNode.next;
            }
            for (; curListNode2 != null; curListNode2 = curListNode2.next) {
                int tmpVal = curListNode2.val + carryVal;
                carryVal = tmpVal / 10;
                curResultListNode.next = new ListNode(tmpVal % 10);
                curResultListNode = curResultListNode.next;
            }

            if (carryVal > 0) {
                curResultListNode.next = new ListNode(carryVal);
            }

            return resultList.next;
        }

        public ListNode reverse(ListNode listNode) {
            ListNode head = listNode, middle = null, tail = null;
            while (null != head) {
                tail = middle;
                middle = head;
                head = head.next;
                middle.next = tail;
            }
            return middle;
        }
    }
}
