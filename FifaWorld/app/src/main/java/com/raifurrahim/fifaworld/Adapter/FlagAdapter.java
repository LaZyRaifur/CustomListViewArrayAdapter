package com.raifurrahim.fifaworld.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.raifurrahim.fifaworld.R;
import com.raifurrahim.fifaworld.View.Flag;

import java.util.ArrayList;
import java.util.List;

public class FlagAdapter extends ArrayAdapter<Flag> {

    private Context mContext;
    private List<Flag>falgList;


    public FlagAdapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage")@LayoutRes ArrayList<Flag>list) {
        super(context,0,list);

        mContext = context;
        falgList = list;



    }



    @NonNull
    @Override
    public View getView(int position,@Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        }

        Flag currentFlag = falgList.get(position);

        ImageView image = listItem.findViewById(R.id.posterImage);
        image.setImageResource(currentFlag.getmImage());

        TextView name = listItem.findViewById(R.id.title_text);
        name.setText(currentFlag.getmName());

        TextView description = listItem.findViewById(R.id.description_text);
        description.setText(currentFlag.getmDescription());

        return listItem;
    }
}
