package org.example.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayL {
    public static void main(String[] args) {

//        solarSystem();
        System.out.println("======================================");
        sorT();
        reversE();
//        swap();
//        disJoint();
    }

    public static void lottery() {
        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 0; i <= 100; i++) {
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        System.out.println("Attention! First 10 numbers appear from reel!");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ": " + lottery.get(i));
        }
    }

    public static void solarSystem() {
        String mercury = "Меркурий";
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth,
                mars, jupiter, saturn, uranus, neptune)));
//        solarSystem.add("Плутон");
        System.out.println(solarSystem);
    }

    public static void swap() {
        String mercury = ("Меркурий");
        String venus = ("Венера");
        String earth = ("Земля");
        String mars = ("Марс");
        String jupiter = ("Юпитер");
        String saturn = ("Сатурн");
        String uranus = ("Уран");
        String neptune = ("Нептун");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(neptune, venus, earth,
                mars, jupiter, saturn, uranus, mercury));
        System.out.println(solarSystem);
        Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(neptune));
        System.out.println(solarSystem);
    }

    public static void disJoint() {
        String mercury = ("Меркурий");
        String venus = ("Венера");
        String earth = ("Земля");
        String mars = ("Марс");
        String jupiter = ("Юпитер");
        String saturn = ("Сатурн");
        String uranus = ("Уран");
        String neptune = ("Нептун");

        ArrayList<String> solar1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));
        ArrayList<String> solar2 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));

        System.out.println(Collections.disjoint(solar1, solar2));
    }

    public static void sorT() {
        String mercury = ("Меркурий");
        String venus = ("Венера");
        String earth = ("Земля");
        String mars = ("Марс");
        String jupiter = ("Юпитер");
        String saturn = ("Сатурн");
        String uranus = ("Уран");
        String neptune = ("Нептун");

        ArrayList<String> solar = new ArrayList<>(Arrays.asList(mercury, venus, earth,
                mars, jupiter, saturn, uranus, neptune));
        Collections.sort(solar);
        System.out.println(solar);
    }

    public static void reversE() {
        String mercury = ("Меркурий");
        String venus = ("Венера");
        String earth = ("Земля");
        String mars = ("Марс");
        String jupiter = ("Юпитер");
        String saturn = ("Сатурн");
        String uranus = ("Уран");
        String neptune = ("Нептун");

        ArrayList<String> solar = new ArrayList<>(Arrays.asList(mercury, venus, earth,
                mars, jupiter, saturn, uranus, neptune));
        Collections.sort(solar);
        Collections.reverse(solar);
        System.out.println(solar);
    }
}
