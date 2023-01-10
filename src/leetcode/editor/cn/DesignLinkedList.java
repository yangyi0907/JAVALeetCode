package leetcode.editor.cn;

/**
 * 题目Id：707
 * 题目：设计链表
 *
 * @author yangyi
 */
public class DesignLinkedList {
    public static void main(String[] args) {

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class ListNode {
        int val;
        ListNode pre;
        ListNode next;
    }

    class MyLinkedList {
        ListNode head;
        ListNode tail;

        public MyLinkedList() {
            head = new ListNode();
            tail = new ListNode();
            head.next = tail;
            tail.pre = head;
        }

        public int get(int index) {
            ListNode p = head;
            int n = -1;
            while (p.next.next != null) {
                n++;
                p = p.next;
                if (n == index) {
                    return p.val;
                }
            }
            return -1;
        }

        public void addAtHead(int val) {
            ListNode p = new ListNode();
            p.val = val;
            p.next = head.next;
            p.pre = head.next.pre;
            head.next.pre = p;
            head.next = p;
        }

        public void addAtTail(int val) {
            ListNode p = new ListNode();
            p.val = val;
            p.pre = tail.pre;
            p.next = tail.pre.next;
            tail.pre.next = p;
            tail.pre = p;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0){
                addAtHead(val);
                return;
            }
            ListNode ne = new ListNode();
            ne.val = val;
            ListNode p = head;
            int n = -1;
            while (p.next != null) {
                n++;
                if (n == index) {
                    ne.next = p.next;
                    ne.pre = p.next.pre;
                    p.next.pre = ne;
                    p.next = ne;
                }else{
                    p = p.next;
                }
            }
        }

        public void deleteAtIndex(int index) {
            ListNode p = head;
            int n = -1;
            while (p.next.next != null) {
                n++;
                if (n == index) {
                    p.next = p.next.next;
                    p.next.pre = p;
                    break;
                } else {
                    p = p.next;
                }
            }
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
//leetcode submit region end(Prohibit modification and deletion)

} 