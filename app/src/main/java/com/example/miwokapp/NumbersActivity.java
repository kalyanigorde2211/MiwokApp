package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.miwokapp.WordAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> words = new ArrayList<word>();

        words.add(new word("one", "lutti", R.drawable.number_one,R.raw.number_one));
        words.add(new word("Two", "otiiko", R.drawable.number_two,R.raw.number_two));
        words.add(new word("Three", "tolookosu", R.drawable.number_three,R.raw.number_three));
        words.add(new word("Four", "oyyisa", R.drawable.number_four,R.raw.number_four));
        words.add(new word("Five", "massokka", R.drawable.number_five,R.raw.number_five));
        words.add(new word("Six", "temmokka", R.drawable.number_six,R.raw.number_six));
        words.add(new word("Seven", "kenekaku", R.drawable.number_seven,R.raw.number_seven));
        words.add(new word("Eight", "kawinta", R.drawable.number_eight,R.raw.number_eight));
        words.add(new word("Nine", "wo'e", R.drawable.number_nine,R.raw.number_nine));
        words.add(new word("Ten", "na'accha", R.drawable.number_ten,R.raw.number_ten));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word w=words.get(position);
                 MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity.this, w.getmAudioResourceId());
                mediaPlayer.start();
            }
        });


    }

}
