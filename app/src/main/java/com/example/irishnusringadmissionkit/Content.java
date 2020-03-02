package com.example.irishnusringadmissionkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Content extends AppCompatActivity {

    ListView listView;

    String[] math_chapter_name = {"প্রয়োজনীয় সূত্রাবলী","বাস্তব সংখ্যা, ভগ্নাংশ ও সেট", "ল.সা.গু ও গ.সা.গু",
            "বর্গ ও বর্গমূল, গড়", "শতকরা ও লাভ-ক্ষতি","সরল-সুদকষা","অনপাত-সমানুপাত"};

    String[] eng_chapter_name = {"Appropriate Preposition", " Idioms & Phrases", "Synonyms & Antonyms",
            "Spelling", "Confusing Word", "Translation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        listView = findViewById(R.id.listViewId);



        Intent intent = getIntent();
        final String receivedSubName = intent.getStringExtra("name");

        if (receivedSubName.equals("math")){

            ArrayAdapter<String> adapter =
                    new ArrayAdapter<String>(Content.this, R.layout.row_data, R.id.textViewId, math_chapter_name);
            listView.setAdapter(adapter);

        }

        if (receivedSubName.equals("english")){

            ArrayAdapter<String> adapter =
                    new ArrayAdapter<String>(Content.this, R.layout.row_data, R.id.textViewId, eng_chapter_name);
            listView.setAdapter(adapter);

        }


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (receivedSubName.equals("math")){

                    Intent intent = new Intent(Content.this, Math.class);
                    intent.putExtra("name", math_chapter_name[i]);
                    startActivity(intent);
                }

                if (receivedSubName.equals("english")){

                    Intent intent = new Intent(Content.this, Math.class);
                    intent.putExtra("name", eng_chapter_name[i]);
                    startActivity(intent);
                }

            }
        });


    }


}
