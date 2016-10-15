package com.tehmou.coffeebreak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText searchBox;
    private TextView searchResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.searchBox = (EditText) findViewById(R.id.search_box);
        this.searchResults = (TextView) findViewById(R.id.search_results);

        // Insert Rx code here
    }

    private void search(CharSequence searchTerm) {
        this.searchResults.setText(searchTerm);
    }

}
