package leetcode.editor.cn;

import java.security.cert.PolicyNode;

/**
 * 题目Id：203
 * 题目：移除链表元素
 *
 * @author yangyi
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        Solution solution = new RemoveLinkedListElements().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode h = new ListNode(-1);
            h.next = head;
            ListNode p = h;
            while (p != null && p.next != null) {
                while (p.next != null && p.next.val == val) {
                    p.next = p.next.next;
                }
                p = p.next;

            }
            return h.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 