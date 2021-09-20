package edu.floridapoly.mobiledeviceapps.fall21.andrewponce_aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String Name = "favorite";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendFavCourse(View view){
        Toast.makeText(getApplicationContext(),
                "Course Activity Button Pressed!",
                Toast.LENGTH_SHORT)
                .show();
        Intent intent = new Intent(this, FavoriteActivity.class);
        EditText editText = findViewById(R.id.favCourse_editTxt);
        String favName = editText.getText().toString();
        String favType = "course";
        String favDesc = "Favorite Course";
        String [] favorite = {favName, favType, favDesc};
        intent.putExtra(Name,favorite);
        startActivity(intent);
    }
    public void sendFavSong(View view){
        Toast.makeText(getApplicationContext(),
                "Song Activity Button Pressed!",
                Toast.LENGTH_SHORT)
                .show();
        Intent intent = new Intent(this, FavoriteActivity.class);
        EditText editText = findViewById(R.id.favSong_editTxt);
        String favName = editText.getText().toString();
        String favType = "song";
        String favDesc = "Favorite Song";
        String [] favorite = {favName, favType, favDesc};
        intent.putExtra(Name,favorite);
        startActivity(intent);
    }
    }
