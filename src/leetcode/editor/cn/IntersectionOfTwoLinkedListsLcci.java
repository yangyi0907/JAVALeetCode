package leetcode.editor.cn;

/**
 * 题目Id：面试题 02.07
 * 题目：链表相交
 *
 * @author yangyi
 */
public class IntersectionOfTwoLinkedListsLcci {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoLinkedListsLcci().new Solution();
    }
    
        //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        int n1 = 0, n2 = 0;
        while (p1 != null) {
            n1++;
            p1 = p1.next;
        }
        while (p2 != null) {
            n2++;
            p2 = p2.next;
        }
        p1 = headA;
        p2 = headB;
        int more = 0;
        if (n1 > n2) {
            more = n1 - n2;
            while (more-- != 0) {
                p1 = p1.next;
            }
        } else {
            more = n2 - n1;
            while (more-- != 0) {
                p2 = p2.next;
            }
        }
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 