package ua.dp.itstep.Lesson.foreach_;

import ua.dp.itstep.Lesson.ExampleAbstract;

import java.util.List;
import java.util.Set;

/**
 * Created by kh0ma on 06.07.17.
 */
public class Example1 extends ExampleAbstract {
    public static void main(String[] args) {
        printList(DATA_HELPER.getListOfStrings());
//        printSet(DATA_HELPER.getSetOfStrings());
    }

    public static void printList(List list) {
        for (Object element: list) {
            System.out.println(element);
        }
    }

    public static void printSet(Set data) {
        for (Object element: data) {
            System.out.println(element);
        }
    }
}
