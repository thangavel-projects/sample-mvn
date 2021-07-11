/*
 * Copyright (c) 2020. Thangavel Loganathan, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Thangavel Loganathan, reach me out at <thangavel2code@gmail.com>
 * for further if you want to use it.
 *
 */

package com.sample;

import java.util.Scanner;

public class CateringBooking {
    String serv;
    int menuSet;
    String timeAndDate;
    boolean valid = true;


    public static void main(String[] args) {
        CateringBooking cateringBooking = new CateringBooking();
        cateringBooking.kindOfService();
    }

    //Selecting the kind of service method
    public String kindOfService() {
        System.out.println("1. TYPE OF SERVICE SELECTION");
        System.out.println("Select the kind of service you want.");
        System.out.println("");
        System.out.println("A: Basic");
        System.out.println("B: Premium");
        System.out.println("C: Deluxe");
        System.out.println("D: Fiesta Deluxe");

        Scanner myService = new Scanner(System.in);
        System.out.print("Letter of your choice: ");
        String selectService = myService.nextLine();


        while (valid) {
            if (selectService.equals("A") || selectService.equals("a")) {
                valid = false;
                System.out.println("You've selected: Basic service");
            } else if (selectService.equals("B") || selectService.equals("b")) {
                valid = false;
                System.out.println("You've selected: Premium service");
            } else if (selectService.equals("C") || selectService.equals("c")) {
                valid = false;
                System.out.println("You've selected: Deluxe service");
            } else if (selectService.equals("D") || selectService.equals("d")) {
                valid = false;
                System.out.println("You've selected: Fiesta Deluxe service");
            } else {
                valid = false;
                System.out.println("Your choice is not available. Please try again.");
                System.out.println("");
            }
        }
        serv = selectService;
        return selectService;
    }
}