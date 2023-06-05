package leetcode.editor.cn;

import java.util.List;

/**
 * 题目Id：19
 * 题目：删除链表的倒数第 N 个结点
 *
 * @author yangyi
 */
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode temp = new ListNode(-1);
            temp.next = head;
            head = temp;
            ListNode fast = head;
            while (n-- > 0) {
                if (fast != null) {
                    fast = fast.next;
                } else {
                    return head;
                }
            }
            while (fast.next != null) {
                fast = fast.next;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return head.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 