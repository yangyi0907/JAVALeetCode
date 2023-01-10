package leetcode.editor.cn;

/**
 * 题目Id：24
 * 题目：两两交换链表中的节点
 *
 * @author yangyi
 */
public class SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new SwapNodesInPairs().new Solution();
    }

    public class ListNode {
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

    //leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode ans = new ListNode(-1);
            ListNode p = ans;
            while (head != null && head.next != null) {
                ListNode n = head.next.next;
                p.next = head.next;
                p = p.next;
                p.next = head;
                p = p.next;
                p.next = null;
                head = n;
            }
            if (head != null) {
                p.next = head;
                p = p.next;
            }
            return ans.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 