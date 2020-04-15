package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<ItemModal> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        items = new ArrayList<ItemModal>();

        items.add(new ItemModal("Hieu Nguyen Van",R.drawable.image1,"KTMT-06 Dai Hoc BKHN","12:08 PM"));
        items.add(new ItemModal("Tran Ngoc Vinh",R.drawable.image2,"KTMT-06 Dai Hoc BKHN","15:09 PM"));
        items.add(new ItemModal("Hoang Duc Truong",R.drawable.image3,"KTMT-06 Dai Hoc BKHN","10:00 AM"));
        items.add(new ItemModal("Nguyen Doan Nam",R.drawable.image4,"KTMT-06 Dai Hoc BKHN","14:06 PM"));
        items.add(new ItemModal("Nguyen Ba Quan",R.drawable.image5,"KTMT-06 Dai Hoc BKHN","08:0 AM"));
        items.add(new ItemModal("Dao Quang Trung",R.drawable.image6,"KTMT-06 Dai Hoc BKHN","16:26 PM"));
        items.add(new ItemModal("Khi Dang Quan",R.drawable.image7,"KTMT-06 Dai Hoc BKHN","12:45 PM"));
        items.add(new ItemModal("Tran Van Nghiem",R.drawable.image8,"KTMT-06 Dai Hoc BKHN","17:15 PM"));
        items.add(new ItemModal("Hoang Duc Dung",R.drawable.image9,"KTMT-06 Dai Hoc BKHN","06:10 AM"));
        items.add(new ItemModal("Nguyen Van Hai",R.drawable.image10,"KTMT-06 Dai Hoc BKHN","15:08 PM"));

        ContactAdapter adapter = new ContactAdapter(items);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
