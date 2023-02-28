package org.example.stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) throws IOException {
        Stream<String> fromValues = Stream.of("A", "B", "C");
        Stream<String> fromCollection = Arrays.asList("A", "B", "C").stream();
        Stream<String> fromArray = Arrays.stream(new String[]{"x", "y", "z"});
//        Stream<String> fromFile = Files.lines(Paths.get("input.txt"));
//        FileReader fileReader = new FileReader("input.txt");
//        Scanner scanner = new Scanner(fileReader);
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.hasNext());
//        }
//
//        fileReader.close();

        IntStream fromString = "0123456789".chars();

        Stream<Object> fromBuilder = Stream.builder().add("z").add("y").add("z").build();

        Stream<Integer> fromIterate = Stream.iterate(1, n -> n + 1);

        Iterator<Integer> iterator = fromIterate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
