package org.example.collection.map;

import lombok.ToString;

import java.util.Objects;

@ToString
public class Student implements Comparable<Student>{
    public String name;
    public String surname;
    public int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student other) {
        return this.surname.compareTo(other.surname);
    }
}
