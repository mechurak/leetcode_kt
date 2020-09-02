package q0004_MedianOfTwoSortedArrays


class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val l = nums1.size + nums2.size
        return if (l % 2 == 0) {
            val v1 = kth(nums1, nums2, l / 2 - 1)
            val v2 = kth(nums1, nums2, l / 2)
            (v1 + v2) / 2.0
        } else {
            kth(nums1, nums2, l / 2).toDouble()
        }
    }

    fun kth(a: IntArray, b: IntArray, k: Int): Int {
        if (a.isEmpty()) {
            return b[k]
        }
        if (b.isEmpty()) {
            return a[k]
        }

        var left = a
        var right = b
        var ia = a.size / 2
        var ib = b.size / 2
        val ma = a[ia]
        val mb = b[ib]

        if (mb < ma) {
            left = b
            right = a
            val temp = ia
            ia = ib
            ib = temp
        }

        return if (ia + ib < k) {
            kth(left.sliceArray(ia + 1 until left.size), right, k - ia - 1)
        } else {
            kth(left, right.sliceArray(0 until ib), k)
        }
    }
}
