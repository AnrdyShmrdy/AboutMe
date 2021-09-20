package edu.floridapoly.mobiledeviceapps.fall21.andrewponce_aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String Name = "favorite";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void toastMyName(){
        TextView myName = findViewById(R.id.myName_txtView);
        Toast.makeText(getApplicationContext(),
                "name: " + myName.getText(),
                Toast.LENGTH_SHORT)
                .show();
    }
    private void toastFavInfo(String type, String name){ //toast message with fav name and type
        Toast.makeText(getApplicationContext(),
                type + ": " + name,
                Toast.LENGTH_SHORT)
                .show();
    }
    public void sendFavCourse(View view){
        Intent intent = new Intent(this, FavoriteActivity.class);
        EditText editText = findViewById(R.id.favCourse_editTxt);
        String favName = editText.getText().toString();
        String favType = "course";
        String favDesc = "Favorite Course";
        toastMyName();
        toastFavInfo(favType,favName);
        String [] favorite = {favName, favType, favDesc};
        intent.putExtra(Name,favorite);
        startActivity(intent);
    }
    public void sendFavSong(View view){
        Intent intent = new Intent(this, FavoriteActivity.class);
        EditText editText = findViewById(R.id.favSong_editTxt);
        String favName = editText.getText().toString();
        String favType = "song";
        String favDesc = "Favorite Song";
        toastMyName();
        toastFavInfo(favType,favName);
        String [] favorite = {favName, favType, favDesc};
        intent.putExtra(Name,favorite);
        startActivity(intent);
    }
    }
