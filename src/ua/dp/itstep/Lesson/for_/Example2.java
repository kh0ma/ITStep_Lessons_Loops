package ua.dp.itstep.Lesson.for_;

import ua.dp.itstep.Lesson.ExampleAbstract;

/**
 * Created by kh0ma on 06.07.17.
 */
public class Example2 extends ExampleAbstract {
    public static void main(String[] args) {
//        printEven(DATA_HELPER.getIntArray());
        printOdd(DATA_HELPER.getIntArray());
    }

    public static void printEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void printOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
