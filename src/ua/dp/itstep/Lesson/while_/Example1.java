package ua.dp.itstep.Lesson.while_;

import ua.dp.itstep.Lesson.ExampleAbstract;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by kh0ma on 06.07.17.
 */
public class Example1 extends ExampleAbstract {
    public static void main(String[] args) {
//        printSet(DATA_HELPER.getSetOfInteger());
//        printSet(DATA_HELPER.getSetOfStrings());
        printIntArr(DATA_HELPER.getIntArray());
    }

    public static void printSet(Set data) {
        Iterator iterator = data.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printIntArr(int[] array) {
        int i = 0;
        while(i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }
}
