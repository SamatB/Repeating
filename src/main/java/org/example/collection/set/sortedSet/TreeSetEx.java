package org.example.collection.set.sortedSet;

import lombok.ToString;

import java.util.TreeSet;


public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student student1 = new Student("Max", 1);
        Student student2 = new Student("john", 2);
        Student student3 = new Student("Sam", 3);
        Student student4 = new Student("Melly", 4);
        Student student5 = new Student("Will", 5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students.first());
        System.out.println(students.pollFirst());
        System.out.println(students);
    }
}

@ToString
class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }
}
