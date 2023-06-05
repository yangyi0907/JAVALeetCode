package leetcode.editor.two;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // 1 2 3 4 5
    // 3 1 5 2 4
    // 2 1 4 3 5
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] num = new int[n + 1];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        int l = 1, r = 1;
        for (int i = 1; i < k + 1; i++) {
            r += 1;
            if (i != k) {
                swap(num, l, r);
                l = r + 1;
                r = l;
            } else {
                swap(num, l, n);
            }
        }
        for (int i = 1; i < num.length; i++) {
            System.out.print(num[i]);
            System.out.print(" ");
        }
    }

    static void swap(int[] num, int i, int j) {
        int t = num[i];
        num[i] = num[j];
        num[j] = t;
    }
}

