package com.example.phonecontactlist;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] contacts={
            "Aditya - 9807654321",
            "Bhargav - 9870654212",
            "Chaiytanya - 9123345678",
            "Dhoni - 9812345670",
            "Eesha - 9871234560",
            "Faran - 9712345600",
            "Guru - 9123456780",
            "Hari - 7123456890",
            "Indira - 812345820",
            "Janu - 7890123456"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listView);
        //Create Adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,contacts);
        //Set Adapter to List View
        listView.setAdapter(adapter);
        //Item  Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedContact=contacts[i];
                Toast.makeText(MainActivity.this,"Selected: "+selectedContact,Toast.LENGTH_LONG).show();
            }
        });
    }
}