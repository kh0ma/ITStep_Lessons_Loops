package ua.dp.itstep.Lesson.for_;

import ua.dp.itstep.Lesson.ExampleAbstract;

/**
 * Created by kh0ma on 06.07.17.
 */
public class Example3 extends ExampleAbstract {
    public static void main(String[] args) {
        printFirst5El(DATA_HELPER.getIntArray());
    }

    public static void printFirst5El(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 5) break;
            System.out.println(array[i]);
        }
        System.out.println("loop is finished");
    }
}
