package ua.dp.itstep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kh0ma on 06.07.17.
 */
public class DataHelper {
    public int[] getIntArray() {
        return new int[]{1,2,3,4,5,6,7,8,9,10};
    }

    public String[] getStringArray() {
        return new String[]{"Alex","Petya","Vasya"};
    }

    public Set getSetOfStrings() {
        Set result = new HashSet();
        result.add("Alex");
        result.add("Petya");
        result.add("Vasya");
        return result;
    }

    public Set getSetOfInteger() {
        Set result = new HashSet();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);
        result.add(8);
        result.add(9);
        result.add(10);
        return result;
    }

    public List getListOfStrings() {
        List result = new ArrayList();
        result.add("Alex");
        result.add("Petya");
        result.add("Vasya");
        return result;
    }

    public List getListOfInteger() {
        List result = new ArrayList();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);
        result.add(8);
        result.add(9);
        result.add(10);
        return result;
    }

    public int[] getDisorderedIntArray() {
        return new int[]{1,20,3,4,50,-6,70,8,9,1032};
    }
}
