package leetcode.editor.cn;

import java.util.*;

/**
 * 题目Id：210
 * 题目：课程表 II
 *
 * @author yangyi
 */
public class CourseScheduleIi {
    public static void main(String[] args) {
        Solution solution = new CourseScheduleIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /*
         * 输入：numCourses = 2, prerequisites = [[1,0]]
         * 输出：[0,1]
         * 解释：总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
         * */
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            int[] nums = new int[numCourses];
            int[] res = new int[numCourses];
            int index = 0;
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < numCourses; i++) {
                map.put(i, new ArrayList<>());
            }
            for (int[] pre : prerequisites) {
                nums[pre[0]]++;
                List<Integer> m = map.get(pre[1]);
                m.add(pre[0]);
            }
            LinkedList<Integer> queue = new LinkedList();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    queue.add(i);
                    res[index++] = i;
                }
            }
            while (!queue.isEmpty()) {
                Integer n = queue.remove();
                List<Integer> list = map.get(n);
                for (Integer l : list) {
                    nums[l]--;
                    if (nums[l] == 0) {
                        queue.add(l);
                        res[index++] = l;
                    }
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    return new int[0];
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 