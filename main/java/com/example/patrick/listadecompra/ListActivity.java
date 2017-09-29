package com.example.patrick.listadecompra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private TextView title;
    private Spinner spinner;

    private EditText name;
    private EditText quant;
    private Button btn;
    private CheckBox chk;

    ArrayList<Item> items = new ArrayList<>();
    ListView list;
    String[] categories = { "Categoria 1", "Categoria 2", "Categoria 3", "Categoria 4", "Categoria 5" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        title = (TextView) findViewById(R.id.list_title);


        Bundle params = getIntent().getExtras();
        title.setText(params.getString("nameList"));

        list = (ListView) findViewById(R.id.list_items);
        final ArrayAdapter adapter = new ItemAdapter(this, R.layout.list_item, items);
        list.setAdapter(adapter);

        // Adicionar categorias ao spinner
        spinner = (Spinner) findViewById(R.id.list_item_spinner);
        ArrayAdapter<String> adapterCategories = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categories);
        adapterCategories.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapterCategories);

        name = (EditText) findViewById(R.id.list_item_name);
        quant = (EditText) findViewById(R.id.list_item_category);
        chk = (CheckBox) findViewById(R.id.list_chkPerecivel);
        btn = (Button) findViewById(R.id.list_btnAdd);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item item = new Item(quant.getText().toString(), name.getText().toString(), spinner.getSelectedItem().toString());
                items.add(item);
                list.setAdapter(adapter);
            }
        });
    }
}
