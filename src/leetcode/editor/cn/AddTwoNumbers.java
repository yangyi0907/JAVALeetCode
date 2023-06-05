package leetcode.editor.cn;

/**
 * 题目Id：2
 * 题目：两数相加
 *
 * @author yangyi
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode res = new ListNode(-1);
            ListNode p = res;
            int more = 0;
            while (l1 != null || l2 != null || more != 0) {
                int n1 = l1 != null ? l1.val : 0;
                int n2 = l2 != null ? l2.val : 0;
                int sum = n1 + n2 + more;
                more = sum / 10;
                sum %= 10;
                p.next = new ListNode(sum);
                p = p.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            return res.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 