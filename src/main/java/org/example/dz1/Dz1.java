package org.example.dz1;

import java.util.ArrayList;
import java.util.List;

public class Dz1 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(10);
        int sum = list1.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сумма чисел = "+sum);
        int col= list1.size();
        System.out.println("Колличество элементов = "+col);
    }
}
