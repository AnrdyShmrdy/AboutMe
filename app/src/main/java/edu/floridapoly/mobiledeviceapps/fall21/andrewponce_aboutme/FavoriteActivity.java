package edu.floridapoly.mobiledeviceapps.fall21.andrewponce_aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FavoriteActivity extends AppCompatActivity {
    String[] favorite = {"favName", "favType", "favDesc"};
    Boolean isApproved = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        Intent intent = getIntent();
        favorite = intent.getStringArrayExtra(MainActivity.Name);
        String favName = favorite[0];
        String favType = favorite[1];
        String favDesc = favorite[2];


        TextView favDescTxtView = findViewById(R.id.favDesc_txtView);
        TextView favNameTxtView = findViewById(R.id.favName_txtViewVal);
        favNameTxtView.setText(favName);
        favDescTxtView.setText(favDesc);

    }
    public void approveBtnPress(View view){
        Button approve_btn = findViewById(R.id.approve_btn);
        approve_btn.setText("approved");
        isApproved = true;
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        if(isApproved) {

            Button approve_btn = findViewById(R.id.approve_btn);
            String type = favorite[1];
            Toast.makeText(getApplicationContext(),
                    "Returning from " + type + ", Received: APPROVED!",
                    Toast.LENGTH_SHORT)
                    .show();
        }
    }
}