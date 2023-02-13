package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 题目Id：56
 * 题目：合并区间
 *
 * @author yangyi
 */
public class MergeIntervals {
    public static void main(String[] args) {
        Solution solution = new MergeIntervals().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] != o2[0]) {
                        return o1[0] - o2[0];
                    } else {
                        return o1[1] - o2[1];
                    }
                }
            });
            List<int[]> list = new ArrayList<>();
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] <= intervals[i - 1][1]) {
                    intervals[i][0] = Math.min(intervals[i][0], intervals[i - 1][0]);
                    intervals[i][1] = Math.max(intervals[i][1], intervals[i - 1][1]);
                } else {
                    list.add(new int[]{intervals[i - 1][0],intervals[i - 1][1]});
                }
            }
            list.add(new int[]{intervals[intervals.length - 1][0],intervals[intervals.length - 1][1]});
            return list.toArray(new int[list.size()][]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 