package leetcode.editor.cn;

import java.util.*;

/**
 * 题目Id：207
 * 题目：课程表
 *
 * @author yangyi
 */
public class CourseSchedule {
    public static void main(String[] args) {
        Solution solution = new CourseSchedule().new Solution();
        solution.canFinish(2,new int[][]{{1,0}});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //先修课程对 [ 1,0] 表示：想要学习课程 1 ，你需要先完成课程 0
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            int[] nums = new int[numCourses];
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < numCourses; i++) {
                map.put(i, new ArrayList<>());
            }
            for (int[] pre : prerequisites) {
                nums[pre[0]]++;
                List<Integer> m = map.get(pre[1]);
                m.add(pre[0]);
            }
            LinkedList<Integer> queue = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    queue.add(i);
                }
            }
            while (!queue.isEmpty()) {
                Integer n = queue.remove();
                List<Integer> l = map.get(n);
                for (Integer i : l) {
                    nums[i]--;
                    if (nums[i] == 0) {
                        queue.add(i);
                    }
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 