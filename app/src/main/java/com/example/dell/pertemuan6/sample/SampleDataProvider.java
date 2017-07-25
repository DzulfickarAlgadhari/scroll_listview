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
        dataItemList=new ArrayList<>();
        dataItemMap=new HashMap<>();

        addItem(new DataItem("1","soal1"));

        addItem(new DataItem("2","soal2"));

        addItem(new DataItem("3","soal3"));
    }

    private static void addItem(DataItem item){
        dataItemList.add(item);
        dataItemMap.put(item.getNomerSoal(), item);
    }

    }




