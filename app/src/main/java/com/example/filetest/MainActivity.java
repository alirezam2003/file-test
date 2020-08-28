package com.example.filetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText inpt_name,inpt_content;
    Button btn_save,btn_load;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view_init();




    }

    private void view_init() {
        inpt_name=findViewById(R.id.inpt_name_file);
        inpt_content=findViewById(R.id.inpt_content_file);
        text=findViewById(R.id.text);
        btn_save=findViewById(R.id.btn_save);
        btn_load=findViewById(R.id.btn_load);
    }

    public void save_it(View view) {
    }

    public void load_it(View view) {
    }
}