package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer = new Customer(
                "123",
                66,
                new Address(1, "Street-11"),
                Collections.singletonList(
                        new CellNumber("777-666-555", 3.140)
                )
        );

        Customer clonedCustomer = (Customer) customer.clone();

        customer.address.setName("Street-12");
        clonedCustomer.address.setName("Street");
        customer.setAge(55);
        clonedCustomer.setId("12");
        System.out.println(customer);
        System.out.println(clonedCustomer);
        System.out.println(customer.equals(clonedCustomer));
    }
}

class Customer implements Cloneable {
    String id;
    int age;
    Address address;
    List<CellNumber> number;

    public Customer(String id, int age, Address address, List<CellNumber> number) {
        this.id = id;
        this.age = age;
        this.address = address;
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(id, customer.id) && Objects.equals(address, customer.address) && Objects.equals(number, customer.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, address, number);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int id = this.address.id;
        String name = this.address.name;
        Address address1 = new Address(id, name);
        List<CellNumber> list = this.number;
        return new Customer(this.id, this.age, address1, list);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", number=" + number +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CellNumber implements Cloneable {
    String number;
    double coverage;

    public CellNumber(String number, double coverage) {
        this.number = number;
        this.coverage = coverage;
    }

    @Override
    public String toString() {
        return "CellNumber{" +
                "number='" + number + '\'' +
                ", coverage=" + coverage +
                '}';
    }
}

class Address implements Cloneable {
    int id;
    String name;

    public Address(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}

