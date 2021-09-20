package edu.floridapoly.mobiledeviceapps.fall21.andrewponce_aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        Intent intent = getIntent();
        String[] favorite = intent.getStringArrayExtra(MainActivity.Name);
        String favName = favorite[0];
        String favType = favorite[1];
        String favDesc = favorite[2];


        TextView favDescTxtView = findViewById(R.id.favDesc_txtView);
        TextView favNameTxtView = findViewById(R.id.favName_txtViewVal);
        favNameTxtView.setText(favName);
        favDescTxtView.setText(favDesc);
    }
}