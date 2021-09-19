package edu.floridapoly.mobiledeviceapps.fall21.andrewponce_aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class course_and_song extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_and_song);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String CourseOrSong = intent.getStringExtra(MainActivity.CourseOrSongName);
        String type = intent.getStringExtra(MainActivity.isCourseOrSong);

        // Capture the layout's TextView and set the string as its text
        TextView isCourseOrSong = findViewById(R.id.favCourseOrSong_txtView);
        TextView favCourseOrSong = findViewById(R.id.favCourseOrSong_txtViewVal);
        favCourseOrSong.setText(CourseOrSong);
        isCourseOrSong.setText(type);
    }
}