package ua.dp.itstep.HomeTask;

/**
 * Created by kh0ma on 06.07.17.
 *
 * Реалізувати метод що повертає
 * суму перших трьох максимальних елементів
 *
 * Використовувати Java8 Stream API
 *
 */
public class Task4 extends AbstractTask {
    public static void main(String[] args) {
        int[] array       = { 2,3,5,4,6,7,0,1,-1};
        int   expectation = 18;

        String answer = (sumOfMax3Elemtns(array) == expectation) ? "Вірно" : "Не вірно";
        System.out.println(answer);
    }

    public static int sumOfMax3Elemtns(int[] array) {

        // TODO: implement it method

        return 0;
    }
}
