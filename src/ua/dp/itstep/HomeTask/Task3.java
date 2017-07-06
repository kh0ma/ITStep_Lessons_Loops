package ua.dp.itstep.HomeTask;

import java.util.Arrays;

/**
 * Created by kh0ma on 06.07.17.
 *
 * Реалізувати метод сортування масиву
 * шляхом використання стандартної бібліотеки
 * (без циклів)
 *
 *
 */
public class Task3 extends AbstractTask {
    public static void main(String[] args) {
        int[] array       = { 2,3,5,4,6,7,0,1,-1};
        int[] expectation = {-1,0,1,2,3,4,5,6, 7};

        String answer = Arrays.equals(sortArray(array),expectation) ? "Вірно" : "Не вірно";
        System.out.println(answer);
    }

    public static int[] sortArray(int[] array) {

        // TODO: implement it method

        return null;
    }
}
