package com.example.dell.pertemuan6.sample;

import android.provider.ContactsContract;

import com.example.dell.pertemuan6.model.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell on 10/05/2017.
 */

public class SampleDataProvider {
    public static List<DataItem>dataItemList;
    public static Map<String, DataItem> dataItemMap;

    static {
        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();
        addItem(new DataItem(null, "1", "Salads",
                "Our quinoa salad is served with quinoa, tomatoes, cucumber, scallions, and smoked salmon. Served with your choice of dressing.",
                1, 12, "quinoa_salad.jpg"));

        addItem(new DataItem(null, "2", "Salads",
                "The chef’s salad has cucumber, tomatoes, red onions, mushrooms, hard-boiled eggs, cheese, and hot grilled chicken on a bed of romaine lettuce. Served with croutons and your choice of dressing.",
                2, 9, "chef_salad.jpg"));

        addItem(new DataItem(null, "3", "Salads",
                "Our house salad is made with romaine lettuce and spinach, topped with tomatoes, cucumbers, red onions and carrots. Served with a dressing of your choice.",
                3, 7, "house_salad.jpg"));

        addItem(new DataItem(null, "4", "Salads",
                "Choose from our fresh local, organically grown ingredients to make a custom salad.",
                4, 10, ""));

        addItem(new DataItem(null, "5", "Starters",
                "These mini cheeseburgers are served on a fresh baked pretzel bun with lettuce, tomato, avocado, and your choice of cheese.",
                1, 8, "mini_cheeseburgers.jpg"));

        addItem(new DataItem(null, "6", "Starters",
                "Large mushroom caps are filled a savory cream cheese, bacon and panko breadcrumb stuffing, topped with cheddar cheese.",
                2, 7, "stuffed_mushrooms.jpg"));

        addItem(new DataItem(null, "7", "Starters",
                "Caramelized onions slow cooked in a savory broth, topped with sourdough and a provolone cheese blend. Served with sourdough bread.",
                3, 7, "french_onion_soup.jpg"));

        addItem(new DataItem(null, "8", "Starters",
                "Our artichokes are brushed with an olive oil and rosemary blend and then broiled to perfection. Served with a side of creamy garlic aioli.",
                4, 9, "artichokes.jpg"));

        addItem(new DataItem(null, "9", "Starters",
                "SOME SAY OUR EGGS ARE DEVILISHLY GOOD. I HAVE TO AGREE.\n" +
                        "These delectable little bites are made with organic eggs, fresh Parmesan, and chopped pine nuts.\"",
                5, 8, "deviled_eggs.jpg"));

        addItem(new DataItem(null, "10", "Entrees",
                "Our classic burger is made with 100% pure angus beef, served with lettuce, tomatoes, onions, pickles, and cheese of your choice. Veggie burger available upon request. Served with French fries, fresh fruit, or a side salad.",
                1, 10, "classic_burger.jpg"));



    }

    private static void addItem(DataItem item){
        dataItemList.add(item);
        dataItemMap.put(item.getItemId(), item);


    }



}
