package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 题目Id：452
 * 题目：用最少数量的箭引爆气球
 *
 * @author yangyi
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    public static void main(String[] args) {
        Solution solution = new MinimumNumberOfArrowsToBurstBalloons().new Solution();
        solution.findMinArrowShots(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(points, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] != o2[0]) {
                        return o1[0] - o2[0];
                    } else {
                        return o1[1] - o2[1];
                    }
                }
            });
            int res = 1;
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] > points[i - 1][1]) {
                    res++;
                } else {
                    points[i][1] = Math.min(points[i - 1][1], points[i][1]);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 