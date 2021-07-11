/*
 * Copyright (c) 2020. Thangavel Loganathan, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Thangavel Loganathan, reach me out at <thangavel2code@gmail.com>
 * for further if you want to use it.
 *
 */

package com.sample;

public class Xor {

    public static void main(String[] args) {
        //int i = extraNumber(2, 2, 5);
        //System.out.println(i);
    }


    public boolean logic_evenlySpaced(int a, int b, int c) {
        int midnum = a;
        int lg = b;
        int sm = c;
        boolean spc = false;
        if ((b < a && a < c) || (b > a && a > c)) {
            midnum = a;
        } else if (a < b && b < c) {
            midnum = b;

        } else if (a > b && b > c) {
            midnum = b;
            lg = a;
            sm = b;
        } else if ((a < c && c < b)) {
            midnum = c;
            sm = b;
            lg = a;
        }

        if (a > c && c > b) {
            midnum = c;
            lg = a;
            sm = b;
        }
        int ms = midnum - sm;
        int ml = lg - midnum;
        if ((midnum == a) && (ml == ms)) {
            spc = true;
        }

        return spc;
    }



}
