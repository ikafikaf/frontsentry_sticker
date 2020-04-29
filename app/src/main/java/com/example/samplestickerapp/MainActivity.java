package com.example.samplestickerapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView lst;
    String[]    stickername={"Pertama","Kedua","Ketiga","Keempat","Kelima","Keenam"};
    String[]    desc={"Ini yang pertama","Ini yang kedua","Ini yang ketiga","Ini yang keempat","Ini yang kelima","Ini yang keenam"};
    Integer[]   imgid={R.drawable.pertama,R.drawable.kedua,R.drawable.ketiga,R.drawable.keempat,R.drawable.kelima,R.drawable.keenam};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lst=(ListView)findViewById(R.id.listview);
            CustomListView customListView=new CustomListView(this,stickername,desc,imgid);
            lst.setAdapter(customListView);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(MainActivity.this,EntryActivity2.class);
                    startActivity(intent);
                }
            }
        });
    }
}
