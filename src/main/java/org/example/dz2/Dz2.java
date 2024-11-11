package org.example.dz2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dz2 {
    public static void main(String[] args) {
        List<String> stroka=new ArrayList<>();
        stroka.add("Мандарин");
        stroka.add("Тыква");
        stroka.add("Кортофель");
        stroka.add("Лимон");
        stroka.add("Арбуз");
        stroka.add("Дыня");

        List<String> list2 = stroka.stream()
                .map(str -> "Fruit: " + str)
                .collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
    }
}
