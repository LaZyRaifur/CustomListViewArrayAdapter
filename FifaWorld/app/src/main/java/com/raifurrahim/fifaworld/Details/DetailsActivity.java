package com.raifurrahim.fifaworld.Details;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.raifurrahim.fifaworld.R;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView,description;


    @Override
    protected void onCreate( Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details);

    imageView = findViewById(R.id.details_image);
    textView = findViewById(R.id.details_text);
    description = findViewById(R.id.description_text);

    Bundle bundle = getIntent().getExtras();

    if (bundle!= null){
        imageView.setImageResource(bundle.getInt("movie_poster"));
        textView.setText(bundle.getString("movie_name"));
        description.setText(bundle.getString("movie_details"));
    }
    }
}
