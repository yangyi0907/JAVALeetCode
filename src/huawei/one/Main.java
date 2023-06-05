package huawei.one;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static List<Integer> list;
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        list = new ArrayList<>();
        int sum = 0;
        for (String s : input) {
            int i = Integer.parseInt(s);
            sum += i;
            list.add(i);
        }
        cnt = sc.nextInt();
        if (cnt >= sum) {
            System.out.println("-1");
            return;
        }
        int l = 0, r = cnt;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (check(mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(r);
    }

    public static boolean check(int n) {
        int m = 0;
        for (Integer i : list) {
            if (i <= n) {
                m += i;
            } else {
                m += n;
            }
        }
        return m <= cnt;
    }
}
