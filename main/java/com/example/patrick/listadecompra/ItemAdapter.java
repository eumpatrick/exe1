package com.example.patrick.listadecompra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Patrick on 29/09/2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {
    Context context;
    ArrayList<Item> items;

    public ItemAdapter(Context context, int resource, ArrayList<Item> objects) {
        super(context, resource, objects);
        this.context = context;
        this.items = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View line = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        TextView amount = (TextView) line.findViewById(R.id.list_txtAmount);
        TextView name = (TextView) line.findViewById(R.id.list_txtName);
        TextView category = (TextView) line.findViewById(R.id.list_txtCategory);

        amount.setText(this.items.get(position).getAmount());
        name.setText(this.items.get(position).getName());
        category.setText(this.items.get(position).getCategory());

        return line;
    }
}
