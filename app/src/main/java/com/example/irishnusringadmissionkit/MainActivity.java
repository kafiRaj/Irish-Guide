package com.example.irishnusringadmissionkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mathBtn, englishBtn, banglaBtn, gkBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mathBtn = findViewById(R.id.mathBtn);
        englishBtn = findViewById(R.id.englishBtn);
        banglaBtn = findViewById(R.id.banglaBtn);
        gkBtn = findViewById(R.id.gkBtn);

        banglaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Math.class);
                intent.putExtra("name", "bangla");
                startActivity(intent);

            }
        });

        mathBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Content.class);
                intent.putExtra("name", "math");
                startActivity(intent);

            }
        });

        englishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Content.class);
                intent.putExtra("name", "english");
                startActivity(intent);

            }
        });

        gkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Math.class);
                intent.putExtra("name", "gk");
                startActivity(intent);

            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.right_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.about){

            Intent intent = new Intent(MainActivity.this, MenuShow.class);
            startActivity(intent);

        }

                if(item.getItemId()==R.id.admission){

                    Intent intent = new Intent(MainActivity.this, Admission.class);
                    startActivity(intent);
        }

        if(item.getItemId()==R.id.contact){

            Intent intent = new Intent(MainActivity.this, Contact.class);
            startActivity(intent);

        }

        if(item.getItemId()==R.id.complain){

            Intent intent = new Intent(MainActivity.this, Complain.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }


}
