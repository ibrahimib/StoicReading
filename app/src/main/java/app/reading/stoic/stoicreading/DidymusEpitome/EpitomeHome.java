package app.reading.stoic.stoicreading.DidymusEpitome;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;


public class EpitomeHome extends AppCompatActivity {
    private Button button;
    private static final String PREFS_NAME = "prefs";
    private static final String PREF_DARK_THEME = "dark_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean useDarkTheme = preferences.getBoolean(PREF_DARK_THEME, false);

        if (useDarkTheme) {
            setTheme(R.style.AppThemeDark);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epitome_home);
        setTitle(this.getString(R.string.AriusDidymusEpitomeTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.epitome_god);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpitomeGod();
            }
        });

        button = findViewById(R.id.epitome_universe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpitomeUniverse();
            }
        });

        button = findViewById(R.id.epitome_soul);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EpitomeSoul();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void EpitomeGod() {
        Intent intent = new Intent(this, EpitomeGod.class);
        startActivity(intent);
    }

    public void EpitomeUniverse() {
        Intent intent = new Intent(this, EpitomeUniverse.class);
        startActivity(intent);
    }

    public void EpitomeSoul() {
        Intent intent = new Intent(this, EpitomeSoul.class);
        startActivity(intent);
    }
}
