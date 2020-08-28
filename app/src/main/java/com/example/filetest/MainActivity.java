package com.example.filetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    EditText inpt_name, inpt_content;
    Button btn_save, btn_load;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view_init();
        File dir = getFilesDir();
        try {
            text.setText(dir.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void view_init() {
        inpt_name = findViewById(R.id.inpt_name_file);
        inpt_content = findViewById(R.id.inpt_content_file);
        text = findViewById(R.id.text);
        btn_save = findViewById(R.id.btn_save);
        btn_load = findViewById(R.id.btn_load);
    }

    public void save_it_internal(View view) {
        String name = inpt_name.getText().toString().replace(" ", "-");
        String content = inpt_content.getText().toString();
        if (name.isEmpty()) {
            inpt_name.setError("fill it out...");
            inpt_name.requestFocus();
            return;
        }
        if (content.isEmpty()) {
            inpt_content.setError("fill it out....");
            inpt_content.requestFocus();
            return;
        }

        //CREATING THE INTERNAL FILE :)
        creat_internal_file(name,content);



    }

    private void creat_internal_file(String name, String content) {
        try {
            FileOutputStream fos= openFileOutput(name,MODE_PRIVATE);
            fos.write(content.getBytes());
            fos.close();
            Toast.makeText(this, "file just created", Toast.LENGTH_SHORT).show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load_it(View view) {
    }
}