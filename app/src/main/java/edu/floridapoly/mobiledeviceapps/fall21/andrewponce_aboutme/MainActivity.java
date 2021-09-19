package edu.floridapoly.mobiledeviceapps.fall21.andrewponce_aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String Fav_Course = "favorite course from activity_main";
    public static final String Fav_Song = "favorite song from activity_main";
    public static String CourseOrSongName;
    public static String isCourseOrSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendFavCourse(View view){
        CourseOrSongName = Fav_Course;
        Toast.makeText(getApplicationContext(),
                "Course Activity Button Pressed!",
                Toast.LENGTH_SHORT)
                .show();
        Intent intent = new Intent(this, course_and_song.class);
        EditText editText = (EditText) findViewById(R.id.favCourse_editTxt);
        String courseName = editText.getText().toString();
        intent.putExtra(CourseOrSongName, courseName);
        intent.putExtra(isCourseOrSong, "Favorite Course");
        startActivity(intent);
    }
    public void sendFavSong(View view){
        CourseOrSongName = Fav_Song;
        Toast.makeText(getApplicationContext(),
                "Song Activity Button Pressed!",
                Toast.LENGTH_SHORT)
                .show();
        Intent intent = new Intent(this, course_and_song.class);
        EditText editText = (EditText) findViewById(R.id.favSong_editTxt);
        String songName = editText.getText().toString();
        intent.putExtra(CourseOrSongName, songName);
        intent.putExtra(isCourseOrSong, "Favorite Song");
        startActivity(intent);
    }
    }
