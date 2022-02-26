package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup myradioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myradioGroup=findViewById(R.id.btnGroupId);
    }

    public void submit(View view) {
        if(myradioGroup.getCheckedRadioButtonId()==R.id.btn4id){
            Toast.makeText(this, "Right Answer", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }
}