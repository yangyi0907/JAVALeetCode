package leetcode.editor.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int m = n + 1;
        m = Math.min(m , 20000);
        int[] temp = new int[n];
        int k = 1;
        for (int i = 1; k < n && i < n; i++) {
            k *= i;
            temp[i] = k;
        }
        int x = 0, y = 0;
        for (int i = 1; i < n; i++) {
            if (i == 2) {
                continue;
            }
            for (int j = 1; j < n; j++) {
                if (j == 2) {
                    continue;
                }
                if (Math.abs(temp[i] * j - j - n) < min) {
                    min = Math.abs(temp[i] * j - j - n);
                    x = i;
                    y = j;
                }
            }
        }
        System.out.print(x);
        System.out.print(" ");
        System.out.println(y);
    }
}