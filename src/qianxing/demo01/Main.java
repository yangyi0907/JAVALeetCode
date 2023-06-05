package qianxing.demo01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
}
