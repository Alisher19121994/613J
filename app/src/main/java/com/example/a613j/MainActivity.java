package com.example.a613j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cardView;
    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        cardView = findViewById(R.id.cardView_id);
        progressBar = findViewById(R.id.progress_id);
        textView = findViewById(R.id.text_id);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Please wait...");
                progressBar.setVisibility(View.VISIBLE);

                data();

            }
        });
    }

    void data() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText("Done");
                progressBar.setVisibility(View.INVISIBLE);
                cardView.setCardBackgroundColor(Color.parseColor("#FF03DAC5"));
            }
        },3000);
    }
}
