package ua.dp.itstep.Lesson.dowhile_;

import ua.dp.itstep.Lesson.ExampleAbstract;

/**
 * Created by kh0ma on 06.07.17.
 */
public class Example1 extends ExampleAbstract {
    public static void main(String[] args) {
        printNTimes(11);
    }

    public static void printNTimes(int times) {
        do {
            System.out.println(times--);
        }
        while (times >= 10);
    }
}
