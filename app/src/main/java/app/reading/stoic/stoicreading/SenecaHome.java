package app.reading.stoic.stoicreading;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Button;

import app.reading.stoic.stoicreading.SenecaMarcia.SenecaMarciaHome;
import app.reading.stoic.stoicreading.SenecaMoralLettersLucilius.SenecaMoralLettersLuciliusHome;
import app.reading.stoic.stoicreading.SenecaOfAnger.SenecaOfAngerHome;
import app.reading.stoic.stoicreading.SenecaOfProvidence.SenecaOfProvidenceHome;
import app.reading.stoic.stoicreading.SenecaOnTheFirmnessOfTheWiseMan.SenecaOnTheFirmnessOfTheWiseManHome;
import app.reading.stoic.stoicreading.SenecaOnTheShortnessOfLife.SenecaOnTheShortnessOfLifeHome;

public class SenecaHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_home);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setTitle(this.getString(R.string.Seneca));

        //Call each activity when click corresponding button
        Button button = findViewById(R.id.seneca_of_providence);
        button.setOnClickListener(v -> SenecaOfProvidenceHome());

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man);
        button.setOnClickListener(v -> SenecaOnTheFirmnessOfTheWiseManHome());

        button = findViewById(R.id.seneca_on_the_shortness_of_life);
        button.setOnClickListener(v -> SenecaOnTheShortnessOfLifeHome());

        button = findViewById(R.id.seneca_moral_letters_lucilius);
        button.setOnClickListener(v -> SenecaMoralLettersLuciliusHome());

        button = findViewById(R.id.seneca_of_anger);
        button.setOnClickListener(v -> SenecaOfAngerHome());

        button = findViewById(R.id.seneca_marcia);
        button.setOnClickListener(v -> SenecaMarciaHome());
    }

    //Activity call methods, called by buttons above
    public void SenecaOfProvidenceHome() {
        Intent intent = new Intent(this, SenecaOfProvidenceHome.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManHome() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseManHome.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessOfLifeHome() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLifeHome.class);
        startActivity(intent);
    }

    public void SenecaMoralLettersLuciliusHome() {
        Intent intent = new Intent(this, SenecaMoralLettersLuciliusHome.class);
        startActivity(intent);
    }

    public void SenecaOfAngerHome() {
        Intent intent = new Intent(this, SenecaOfAngerHome.class);
        startActivity(intent);
    }

    public void SenecaMarciaHome() {
        Intent intent = new Intent(this, SenecaMarciaHome.class);
        startActivity(intent);
    }
}
