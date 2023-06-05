package leetcode.editor.one;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('0', 1);
        map.put('6', 1);
        map.put('9', 1);
        map.put('8', 2);
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            res += map.getOrDefault(str.charAt(i), 0);
        }
        System.out.println(res);
    }
}
