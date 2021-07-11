/*
 * Copyright (c) 2020. Thangavel Loganathan, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Thangavel Loganathan, reach me out at <thangavel2code@gmail.com>
 * for further if you want to use it.
 *
 */

package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {

        Integer[] item_ids = {1, 2};


        Map<Integer, String> itemMap = new HashMap<>();
        itemMap.put(1, "gold1");
        itemMap.put(2, "gold2");
        itemMap.put(3, "gold3");


//        if (item_ids == null || item_ids.length == 0) {
//            return null;
//        }


        List<String> items = new ArrayList<>();
        for (Integer item_id : item_ids) {
            String d = itemMap.get(item_id);
            if (d != null) {
                items.add(d);
            }
        }

       // System.out.println(items);


        List<String> collect = Arrays.stream(item_ids)
                                     .map(itemMap::get)
                                     .filter(Objects::nonNull)
                                     .collect(Collectors.toList());

        System.out.println( collect);

    }

}
