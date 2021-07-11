/*
 * Copyright (c) 2020. Thangavel Loganathan, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Thangavel Loganathan, reach me out at <thangavel2code@gmail.com>
 * for further if you want to use it.
 *
 */

package com.sample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CaseMain {

    public static void main(String[] args) {
        String s = "a1b1";

        List<String> collect = IntStream.range(0, s.length())
                                        .mapToObj(a -> convertCase(s))
                                        .collect(Collectors.toList());


         System.out.println("collect = " + collect);

    }

    private static String convertCase(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(!Character.isDigit(c)) {
                    if (Character.isLowerCase(c)) {
                        char c1 = Character.toUpperCase(c);
                        sb.append(c1);
                        break;
                    }
                }
        }

        return sb.toString();

    }
}
