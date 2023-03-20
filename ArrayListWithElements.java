package telran.homework0903;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class ArrayListWithElements {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
            int temp = i;
        }
//        System.out.println(list);

        for (int temp : list) {
            list.size();
        }
//        System.out.println(list.size());

//      classic for и вызываем list.size() для каждой итерации
        for (int temp = 0; temp < list.size(); temp++) {
//            System.out.print(" " + list.get(temp));
        }


//      classic for, list.size() определяем в переменную, перебираем с конца (i--)
        System.out.println();
        long timeOne = System.currentTimeMillis();
        for (int temp = list.size(); temp >= 0; --temp) {
//            System.out.print(" " + temp);
        }
        long timeOneEnd = System.currentTimeMillis();
        long timeDifferenceFor = timeOneEnd - timeOne;
        System.out.println("loop for time:  " + timeOne + " loop for in the end:  " + timeOneEnd);
        System.out.println("difference for : " + timeDifferenceFor);



        long timeTwo = System.currentTimeMillis();
        ListIterator<Integer> integerListIterator1 = list.listIterator(list.size() - 1);
        while (integerListIterator1.hasPrevious()) {
            integerListIterator1.previous();
//            System.out.println(" " + integerListIterator1.previous());
        }
        long timeTwoEnd = System.currentTimeMillis();
        long timeDiffernceIterator = timeTwoEnd - timeTwo;
        System.out.println("loop iterator time:  " + timeTwo + " loop iterator in the end:  " + timeTwoEnd);
        System.out.println("difference iterator: " + timeDiffernceIterator);

        System.out.println("difference between Iterator and For : " + (timeDiffernceIterator - timeDifferenceFor));

        if (timeDiffernceIterator < timeDifferenceFor) {
            System.out.println("Iterator is faster");
        } else {
            System.out.println("For loop is faster");
        }

    }


}
