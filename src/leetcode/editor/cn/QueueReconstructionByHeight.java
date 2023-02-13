package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 题目Id：406
 * 题目：根据身高重建队列
 *
 * @author yangyi
 */
public class QueueReconstructionByHeight {
    public static void main(String[] args) {
        Solution solution = new QueueReconstructionByHeight().new Solution();
        solution.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
            Arrays.sort(people, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] != o2[0]) {
                        return o1[0] - o2[0];
                    } else {
                        return o2[1] - o1[1];
                    }
                }
            });
            ArrayList<int[]> list = new ArrayList<>();
            for (int i = people.length - 1; i >= 0; i--) {
                if (people[i][1] > list.size()) {
                    list.add(list.size(), people[i]);
                }else{
                    list.add(people[i][1], people[i]);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                people[i] = list.get(i);
            }
            return people;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 