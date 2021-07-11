package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Hello {

    public static void main(String[] args) {

        List<Set<Character>> aList = List.of(Set.of('a', 'b', 'c'),
                Set.of('a', 'b', 'c'),
                Set.of('a', 'b', 'c'),
                Set.of('a'), Set.of('b'));


        long count = aList.stream()
                          .mapToInt(Set::size)
                          .sum();

       // System.out.println("c: " + count);


        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");


        String[] strings = list.toArray(String[]::new);

        ///System.out.printf("a" + Arrays.toString(strings));

        String x = "{ \"example\": \"/My Files/Report/001/002.txt/\"}";

        x = x.replaceFirst("\"/", "\"");
        x =  x.replace("/\"","\"");

        System.out.println("x = " + x);

        int a  =10, b= 20;

        a^= b^(a^- b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String schema = x.replaceAll("\"/", "\"").replaceAll("/\"","\"");


       // System.out.println("schema = " + schema);


    }
}
