package leetcode.editor.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int res = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] num = new int[n - 1][3];
        for (int i = 0; i < n - 1; i++) {
            num[i][0] = in.nextInt();
            num[i][1] = in.nextInt();
            num[i][2] = in.nextInt();
        }
        backward(num, 0, 0, new ArrayList<>());
        System.out.println(res);
    }

    public static void backward(int[][] num, int start, int sum, List<Integer> list) {
        if (sum > res) {
            res = sum;
        }
        for (int i = start; i < num.length; i++) {
            if (list.contains(num[i][0]) || list.contains(num[i][1])) {
                continue;
            }
            sum += num[i][2];
            list.add(num[i][0]);
            list.add(num[i][1]);
            backward(num, i + 1, sum, list);
            sum -= num[i][2];
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
        }
    }
}
