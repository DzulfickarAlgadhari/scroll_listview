package com.example.dell.pertemuan6;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dell.pertemuan6.model.DataItem;
import com.example.dell.pertemuan6.sample.DataItemAdapter;
import com.example.dell.pertemuan6.sample.SampleDataProvider;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    List<DataItem> dataItemList = SampleDataProvider.dataItemList;
    List<String> itemNames = new ArrayList<>();
    List<DataItem> mDataitem;
    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        DataItem item = new DataItem(null,"My Menu Item", "a category",
        //              "a description", 1, 9.95,"applepie.jpg");
/*
        tvOut = (TextView) findViewById(R.id.out);
        tvOut.setText("");


        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });
*/
            for (DataItem item : dataItemList) {
            // tvOut.append(item.getItemName() + "\n");

        itemNames.add(item.getItemName());
    }
        ;
        Collections.sort(itemNames);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemNames);

        final ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(adapter);

        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }

        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView soal =(TextView) findViewById(R.id.editText2);
                soal.setText(itemNames.get(position));
            }
        });


        Button scrolldown =(Button) findViewById(R.id.btnscrolldown);
        Button scrollup = (Button) findViewById(R.id.btnscrollup);

       scrolldown.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               listView.setSmoothScrollbarEnabled(true);
               listView.setSelection(pos++);
           }
       });

        scrollup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                listView.setSmoothScrollbarEnabled(true);
                listView.setSelection(pos--);
            }
        });

    }

}
