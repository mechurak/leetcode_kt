package q0002_AddTwoNumbers

import kotlin.test.assertEquals

class Tc(val name: String, val l1: ListNode?, val l2: ListNode?, val wants: ListNode?)

fun listToString(list: ListNode?): String {
    var cur: ListNode? = list
    var listStr: String = list!!.`val`.toString()
    var intStr: String = list.`val`.toString()
    while (cur!!.next != null) {
        listStr += " -> " + cur.next!!.`val`.toString()
        intStr = cur.next!!.`val`.toString() + intStr
        cur = cur.next
    }
    return "$listStr ($intStr)"
}

fun main() {
    val testCases = arrayListOf(
        Tc("tc1",
            ListNode(2, ListNode(4, ListNode(3))),  // 342
            ListNode(5, ListNode(6, ListNode(4))),  // 465
            ListNode(7, ListNode(0, ListNode(8)))   // 807
        ),
        Tc("tc2",
            ListNode(2, ListNode(4, ListNode(3))),  // 342
            ListNode(5),  // 5
            ListNode(7, ListNode(4, ListNode(3)))   // 347
        ),
        Tc("tc3",
            ListNode(2, ListNode(4, ListNode(3))),  // 342
            ListNode(0),  // 0
            ListNode(2, ListNode(4, ListNode(3)))   // 342
        ),
        Tc("tc4",
            ListNode(7),  // 7
            ListNode(8),  // 8
            ListNode(5, ListNode(1))   // 15
        )
    )

    val sol = Solution()
    for (tc in testCases) {
        println("== ${tc.name} ==")
        println(" l1: ${listToString(tc.l1)}")
        println(" l2: ${listToString(tc.l2)}")
        val ret = sol.addTwoNumbers(tc.l1, tc.l2)
        println(" ret: ${listToString(ret)}")
        assertEquals(listToString(tc.wants), listToString(ret), "error!!!")
    }
}