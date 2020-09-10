package q0013_RomanToInteger

class Solution {
    fun romanToInt(s: String): Int {
        val romanArray = arrayOf("M", "D", "CM", "CD", "C", "L", "XC", "XL", "X", "V", "IX", "IV", "I")
        val valueArray = arrayOf(1000, 500, 900, 400, 100, 50, 90, 40, 10, 5, 9, 4, 1)

        var cur = s
        var startIndex = 0
        val length = romanArray.size
        var ans = 0
        while (cur.isNotEmpty()) {
            for (i in startIndex until length) {
                // println(i)
                if (cur.startsWith(romanArray[i])) {
                    ans += valueArray[i]
                    startIndex = i;
                    // println("${romanArray[i]} : + ${valueArray[i]} = $ans")
                    cur = cur.substring(romanArray[i].length)
                    break;
                }
            }
        }
        return ans
    }
}