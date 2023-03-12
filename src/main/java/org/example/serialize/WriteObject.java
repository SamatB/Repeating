package org.example.serialize;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws FileNotFoundException {

        Person[] people = {
                new Person(1, "Sam"),
                new Person(2, "Asad"),
                new Person(3, "Kara")
        };

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeObject(people);

            ous.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
