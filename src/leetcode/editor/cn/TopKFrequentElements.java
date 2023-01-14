package leetcode.editor.cn;

import java.util.*;

/**
 * 题目Id：347
 * 题目：前 K 个高频元素
 *
 * @author yangyi
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution solution = new TopKFrequentElements().new Solution();
        solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            //设置一个map集合,key存放数字,value存放出现次数
            Map<Integer, Integer> map = new HashMap<>();
            //统计出现次数
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            //建立一个小根堆,用来存放key值,堆内元素按照key对应的value值从大到小排序
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    return map.get(a) - map.get(b);
                }
            });
            //将map中的数字,插入到小根堆中
            for (Integer key : map.keySet()) {
                if (queue.size() < k) {
                    queue.add(key);
                } else if (map.get(key) > map.get(queue.peek())) {
                    queue.poll();
                    queue.add(key);
                }
            }
            //将大根堆中的k个数字放到数组中
            int[] res = new int[k];
            int index = 0;
            while (!queue.isEmpty()) {
                res[index++] = queue.poll();
            }
            return res;
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}