package javalearn.Alist;

import java.util.ArrayList;

/**
 * @author Lenovo
 * @create 2023/3/27 21:45
 **/
public class Alist3 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
                }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
