package org.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CuncurrentMExep {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        for (Integer integer : list) {
//            list.remove(1);
//        }

        CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<>(new Integer[] { 1, 7, 9, 11 });
        Iterator<Integer> iterator = list1.iterator();
        System.out.println(list1);
        while (iterator.hasNext()) {
            iterator.next();
            int i = iterator.next();
            if (i == 7) {
                list1.remove(1);
            }
        }
        System.out.println(list1);


    }

    public <T> Collection<T> symmetricDifference(Collection<T> a, Collection<T> b) {
        // Объединяем коллекции.
        Collection<T> result = new ArrayList<>(a);
        result.addAll(b);

        // Получаем пересечение коллекций.
        Collection<T> intersection = new ArrayList<>(a);
        intersection.retainAll(b);

        // Удаляем элементы, расположенные в обоих коллекциях.
        result.removeAll(intersection);

        return result;
    }

}
