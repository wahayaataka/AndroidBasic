package com.example.androidbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dycode extends AppCompatActivity {
    public static final String EXTRA_DATA = "EXTRA_DATA";
    private EditText editText;
    private Button btnSenData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dycode);
        editText = (EditText)findViewById(R.id.editText);
        btnSenData = (Button)findViewById(R.id.Button);
        btnSenData.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                String data = editText.getText().toString();
                Intent intent = new Intent(Dycode.this, TargetActivity.class);
        intent.putExtra(EXTRA_DATA, data);
        startActivity(intent);
            }
        });
    }
}
