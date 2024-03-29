package com.example.gridviewbasic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends BaseAdapter {

    Context context;
    String [] countrynames;
    int[] flags;
    private LayoutInflater inflater;

    CustomAdapter(Context context,String[] countrynames, int[] flags){
        this.context = context;
        this.countrynames = countrynames;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return countrynames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view,parent,false);

        }
        ImageView imageView = convertView.findViewById(R.id.imageViewId);
        TextView textView = convertView.findViewById(R.id.TextViewId);

        imageView.setImageResource(flags[position]);
        textView.setText(countrynames[position]);

        return convertView;
    }
}
