package com.example.android.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miwokapp.R;

import com.example.miwokapp.word;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word>{

    public WordAdapter(Context context, ArrayList<word> words) {
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.,
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView=(ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage())
        {
        imageView.setImageResource((currentWord.getmImageResourceId()));
        imageView.setVisibility(View.VISIBLE);
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
    }

