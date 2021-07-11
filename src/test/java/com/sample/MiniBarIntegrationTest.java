/*
 * Copyright (c) 2020. Thangavel Loganathan, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Thangavel Loganathan, reach me out at <thangavel2code@gmail.com>
 * for further if you want to use it.
 *
 */

package com.sample;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MiniBarIntegrationTest {


    MiniBar myBar;
    List<MiniBarItem> testItems;

    @Before
    public void init(){
        myBar = new MiniBar("208", 0 );
        testItems = new ArrayList<>();
        testItems.add(new MiniBarItem("Cookie", 19, new Date(2020, 03, 12)));
        testItems.add(new MiniBarItem("Water", 20, new Date(2021, 03, 12)));
        testItems.add(new MiniBarItem("Coke", 21, new Date(2020, 12, 12)));
        testItems.add(new MiniBarItem("Munchies", 23, new Date(2022, 03, 12)));
        testItems.add(new MiniBarItem("Weed", 27, new Date(2019, 03, 12)));
        testItems.add(new MiniBarItem("Beer", 19, new Date(2020, 11, 12)));

        for(MiniBarItem b : this.testItems ) {
            //myBar.addItem(b);
        }

    }

    @Test
    public void testAddItemsToFullList() {
        List<MiniBarItem> testItems1 = new ArrayList<>();

        testItems1.add(new MiniBarItem("6", 19, new Date(2020, 03, 12)));
        testItems1.add(new MiniBarItem("7", 20, new Date(2021, 03, 12)));
        testItems1.add(new MiniBarItem("8", 21, new Date(2020, 12, 12)));
        testItems1.add(new MiniBarItem("9", 21, new Date(2020, 12, 12)));
        testItems1.add(new MiniBarItem("10", 21, new Date(2020, 12, 12)));
        testItems1.add(new MiniBarItem("11", 21, new Date(2020, 12, 12)));


        for(MiniBarItem b :testItems1 ) {
            //myBar.addItem(b);
        }

        assertThrows(Exception.class,
                ()->myBar.addItem(new MiniBarItem("Weed", 27, new Date(2019, 03, 12))));


    }
}
