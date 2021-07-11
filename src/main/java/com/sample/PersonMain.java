package com.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class PersonMain {
    public static void main(String[] args) {

//        List<Person> persons = List.of(new Person("Person1","Surname1", Set.of("gmail","microsoft")),
//                new Person("Person2","Surname1", Set.of("gmail","ebay")),
//                new Person("Person2","Surname3", Set.of("paypal","ibm")),
//                new Person("Person1","Surname2", Set.of("intel","microsoft")));


        Map<Object, Object> objectObjectHashMap = new HashMap<>();
        //objectObjectHashMap.


        int[] my_array = {1, 4, 6, 3, 2};


        int max = IntStream.of(my_array)
                           .max()
                           .getAsInt();

        System.out.println("max = " + max);


    }
}
