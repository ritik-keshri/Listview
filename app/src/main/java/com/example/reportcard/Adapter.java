package com.example.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<data> {

    public Adapter(Context context, ArrayList<data> inf) {
        super(context, 0, inf);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if(itemView == null)
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_format, parent, false);

        data currentData = getItem(position);

        TextView name = itemView.findViewById(R.id.name);
        name.setText(currentData.getName());

        TextView sub = itemView.findViewById(R.id.sub);
        sub.setText(currentData.getSub());

        TextView grade = itemView.findViewById(R.id.grade);
        grade.setText(currentData.getGrade());

        return itemView;
    }
}
