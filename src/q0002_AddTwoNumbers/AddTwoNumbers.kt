package q0002_AddTwoNumbers

/*
https://leetcode.com/problems/add-two-numbers/

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */


class ListNode(var `val`: Int, var next: ListNode? = null) {
//    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        fun add(l1: ListNode?, l2:ListNode?, carry: Int): ListNode {
            val left = l1?.`val` ?: 0
            val right = l2?.`val` ?: 0
            var nextCarry = 0
            var sum = left + right + carry
            if (sum >= 10) {
                sum -= 10
                nextCarry = 1
            }
            val ret = ListNode(sum)
            if (l1?.next != null || l2?.next != null || nextCarry > 0) {
                ret.next = add(l1?.next, l2?.next, nextCarry)
            } else {
                ret.next = null
            }
            return ret
        }

        return add(l1, l2, 0)
    }
}
