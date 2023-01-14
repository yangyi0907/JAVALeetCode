package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 题目Id：232
 * 题目：用栈实现队列
 *
 * @author yangyi
 */
public class ImplementQueueUsingStacks {
    public static void main(String[] args) {

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MyQueue {
        LinkedList<Integer> stack1;
        LinkedList<Integer> stack2;

        public MyQueue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void push(int x) {
            stack1.addLast(x);
        }

        public int pop() {
            while (!stack1.isEmpty()) {
                stack2.addLast(stack1.removeLast());
            }
            int res = stack2.removeLast();
            while (!stack2.isEmpty()) {
                stack1.addLast(stack2.removeLast());
            }
            return res;
        }

        public int peek() {
            while (!stack1.isEmpty()) {
                stack2.addLast(stack1.removeLast());
            }
            int res = stack2.peekLast();
            while (!stack2.isEmpty()) {
                stack1.addLast(stack2.removeLast());
            }
            return res;
        }

        public boolean empty() {
            return stack1.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

} 