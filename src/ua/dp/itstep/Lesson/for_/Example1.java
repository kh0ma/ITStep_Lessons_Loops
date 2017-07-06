package ua.dp.itstep.Lesson.for_;

import ua.dp.itstep.Lesson.ExampleAbstract;

import java.util.List;

/**
 * Created by kh0ma on 06.07.17.
 */
public class Example1 extends ExampleAbstract {
    public static void main(String[] args) {
//        printIntArray(DATA_HELPER.getIntArray());
//        printStringArray(DATA_HELPER.getStringArray());
//        printList(DATA_HELPER.getListOfInteger());
        printList(DATA_HELPER.getListOfStrings());
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
