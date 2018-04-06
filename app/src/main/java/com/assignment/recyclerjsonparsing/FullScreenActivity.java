package com.assignment.recyclerjsonparsing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FullScreenActivity extends AppCompatActivity {
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        name=(TextView)findViewById(R.id.name);
        Intent i=getIntent();
        String name_content=i.getStringExtra("name");
        name.setText(name_content);
    }
}
