package com.example.irishnusringadmissionkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Math extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        pdfView = findViewById(R.id.pdfView);




        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");

        if (receivedName.equals("প্রয়োজনীয় সূত্রাবলী")){

            pdfView.fromAsset("math.pdf").pages(0,1,2,3,4,5,6,7,8,9,10).load();
        }

        if (receivedName.equals("বাস্তব সংখ্যা, ভগ্নাংশ ও সেট")){

            pdfView.fromAsset("math.pdf").pages(11,12,13,14,15,16).load();
        }

        if (receivedName.equals("ল.সা.গু ও গ.সা.গু")){

            pdfView.fromAsset("math.pdf").pages(17,18,19,20,21).load();
        }

        if (receivedName.equals("বর্গ ও বর্গমূল, গড়")){

            pdfView.fromAsset("math.pdf").pages(22,23,34,25,26).load();
        }

        if (receivedName.equals("শতকরা ও লাভ-ক্ষতি")){

            pdfView.fromAsset("math.pdf").pages(27,28,29,30,31,32,33,34).load();
        }
        if (receivedName.equals("সরল-সুদকষা")){

            pdfView.fromAsset("math.pdf").pages(35,36,37,38,39).load();
        }
        if (receivedName.equals("অনপাত-সমানুপাত")){

            pdfView.fromAsset("math.pdf").pages(40,41,42,43).load();
        }



        if (receivedName.equals("bangla")){

            pdfView.fromAsset("bangla.pdf").load();
        }


            if (receivedName.equals("Appropriate Preposition")){

                pdfView.fromAsset("eng.pdf").pages(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20).load();
            }

        if (receivedName.equals("Idioms & Phrases")){

            pdfView.fromAsset("eng.pdf").pages(21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38).load();
        }

        if (receivedName.equals("Synonyms & Antonyms")){

            pdfView.fromAsset("eng.pdf").pages(39,40,41,42,43,44,45,46,47,48,49,50).load();
        }

        if (receivedName.equals("Spelling")){

            pdfView.fromAsset("eng.pdf").pages(51,52,53,54,55,56,57,58,59,60,61,62,63,64,65).load();
        }

        if (receivedName.equals("Confusing Word")){

            pdfView.fromAsset("eng.pdf").pages(66,67,68,69,70).load();
        }

        if (receivedName.equals("Translation")){

            pdfView.fromAsset("eng.pdf").pages(71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87).load();
        }


        if (receivedName.equals("gk")){

            pdfView.fromAsset("gk.pdf").load();
        }

    }
}
