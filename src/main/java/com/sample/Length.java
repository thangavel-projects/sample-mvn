package com.sample;

import java.util.Arrays;
import java.util.List;

public class Length {

    public static void main(String[] args) {
        String  input = "[\"data1\",\"data2\",\"hello,world!\"]";

        String s = input.replaceAll("\\[", "")
                        .replaceAll("]", "");

        String[] split = s.split(",");
        if(split.length > 2) {
            String mergeWord = split[2] + "," + split[3];
            String[] array = {split[0], split[1], mergeWord};
            List<String> collect = Arrays.asList(array);
            System.out.println("collect = " + collect);
        }




    }
}
