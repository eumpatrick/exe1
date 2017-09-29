package com.example.patrick.listadecompra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NameActivity extends AppCompatActivity {

    private EditText nameList;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        nameList = (EditText) findViewById(R.id.name_nameList);
        btn = (Button) findViewById(R.id.name_btnInsert);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameList.getText().toString().isEmpty()) {
                    Toast.makeText(NameActivity.this, "Digite um nome para a lista.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(NameActivity.this, ListActivity.class);
                    Bundle params = new Bundle();
                    params.putString("nameList", nameList.getText().toString());
                    intent.putExtras(params);
                    startActivity(intent);
                }
            }
        });
    }
}
