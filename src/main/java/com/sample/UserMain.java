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

public class UserMain {

    public static void main(String[] args) throws Exception {


        List<User> list = List.of(new User("Admwin", "admin", "empty")
                                    ,new User("Normal", "normal", "empty"));

        list.stream()
              .filter(a -> a.equals("Admin"))
              .findAny()
              .ifPresent(s -> {
                  throw new UserNotFoundException("found");
              });

        System.out.println(list);



//        List<User> userStream = null;
//
//        if (list.stream().anyMatch(s -> !s.equals("Admin"))) {
//                    throw new RuntimeException("two was found");
//        }else {
//            userStream = list.stream()
//                        .map(e -> new User("Admin", "admin", "active"))
//                    .collect(Collectors.toList());
//        }
//        System.out.println(userStream);

    }

    private static void call(User a) throws UserNotFoundException {
       if(a.getName().equals("Admin")){
           System.out.println("ok");
       }else {
           throw new UserNotFoundException("ff");
       }
    }

    private static void run() throws Exception {
        throw new Exception();
    }
}

