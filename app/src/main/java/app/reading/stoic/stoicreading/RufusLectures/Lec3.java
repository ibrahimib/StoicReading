package app.reading.stoic.stoicreading.RufusLectures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.reading.stoic.stoicreading.R;

public class Lec3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec3);
        setTitle(this.getString(R.string.RufusLecturesTitle3));
    }
}
