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
import java.util.Date;
import java.util.List;

public class MiniBar {

    private int itemCapacity;
    private String roomNo;
    private List<MiniBarItem> items = new ArrayList<>();

    public MiniBar(String assignedRoomNo, int newBarCapacity)   {
        this.itemCapacity = newBarCapacity;
        this.roomNo = assignedRoomNo;
    }

    //Add an item
    public void addItem(MiniBarItem newItem) throws Exception {

            //Check the capacity
            if (items.size() == this.itemCapacity)  {
                throw new Exception("The bar is full!");
            } else {
                //Add the item
                items.add(newItem);
            }

    }

    //Remove and Item
    public MiniBarItem removeItem(MiniBarItem itemToRemove) {

       // MiniBarItem itemToReturn = new MiniBarItem();
        try {
            if (items.size() != 0)  {
                for (MiniBarItem barItem : this.items)  {
                    if (itemToRemove.getName() == barItem.getName())    {
                        return barItem;
                    }
                }
            } else {
                throw new Exception("The bar is empty!");
            }

        } catch (Exception barEmpty)    {
            System.out.println(barEmpty.getMessage());
        }
        return null;

    }

    //List Items that are expired
    public List<MiniBarItem> expiredItems (){
        List<MiniBarItem> expiredItems = new ArrayList<>();
        Date currentDate = new Date();
        System.out.print(currentDate);
        for (MiniBarItem item : this.items) {
            if (item.getDate().after(currentDate) ) {
                expiredItems.add(item);
                System.out.println("Added item: " + item);

            }
            else {
                System.out.println("No expired Items on list");
            }
        }
        return expiredItems;
    }
    //Produce a bill
}
