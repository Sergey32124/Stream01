package org.example.dz3;

import jdk.internal.module.ModulePath;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dz3 {
    public static void main(String[] args) {
        float[] numbers = {1.5f, 10.6f, 15.3f, 10.6f, 20.2f, 30.0f, 15.3f};

        // Преобразуем float[] в DoubleStream и работаем с ним

        List<Float> list = Arrays.stream(numbers)
                .mapToDouble(num -> num) // Преобразуем float в double
                .filter(num -> num > 10.5) // Фильтруем значения > 10.5
                .distinct() // Убираем дубликаты
                .mapToObj(num -> (float) num) // Преобразуем обратно в Float
                .collect(Collectors.toList()); // Сохраняем в список

        System.out.println("Список без дубликатов и с числами больше 10.5: " + list);
    }
}
