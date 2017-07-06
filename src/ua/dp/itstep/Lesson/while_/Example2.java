package ua.dp.itstep.Lesson.while_;

import ua.dp.itstep.Lesson.ExampleAbstract;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by kh0ma on 06.07.17.
 */
public class Example2 extends ExampleAbstract {
    public static void main(String[] args) {
        printWithNext(DATA_HELPER.getSetOfStrings());
    }

    public static void printWithNext(Set data) {
        Iterator iterator = data.iterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            if(next == "Petya") continue;
            System.out.println(next);
        }
    }
}
