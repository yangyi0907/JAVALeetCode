package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 题目Id：225
 * 题目：用队列实现栈
 *
 * @author yangyi
 */
public class ImplementStackUsingQueues {
    public static void main(String[] args) {
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyStack {

        LinkedList<Integer> queue1;
        LinkedList<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();//addLast, removeFirst
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue2.addLast(x);
            while (!queue1.isEmpty()) {
                queue2.addLast(queue1.removeFirst());
            }
            while (!queue2.isEmpty()) {
                queue1.addLast(queue2.removeFirst());
            }
        }

        public int pop() {
            return queue1.removeFirst();
        }

        public int top() {
            return queue1.peekFirst();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

} 