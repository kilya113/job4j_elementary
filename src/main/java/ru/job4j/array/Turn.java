package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int point = array.length - 1;
        for (int i = 0; i <= point; i++) {
            temp = array[i];
            array[i] = array[point];
            array[point] = temp;
            point--;
        }
        return array;
    }
}
