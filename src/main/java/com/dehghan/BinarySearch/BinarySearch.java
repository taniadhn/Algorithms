package com.dehghan.BinarySearch;

import java.util.List;

public class BinarySearch {

    public void  binarySearch(List<String> list, String item){
        int low = 0;
        int high = list.size() - 1;
        int mid = (high + low) / 2;
        if(list.get(mid).equals(item)){
            System.out.println("Item found ....");
        }
        else if(list.get(mid).compareTo(item) < 0){
            binarySearch(list.subList(low,mid),item);
            System.out.println("Item not found, continue");
        }
        else {
            System.out.println("Item not found continue....");
        }


    }
}
