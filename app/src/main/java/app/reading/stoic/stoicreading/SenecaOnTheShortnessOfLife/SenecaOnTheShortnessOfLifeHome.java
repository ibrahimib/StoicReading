package app.reading.stoic.stoicreading.SenecaOnTheShortnessOfLife;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class SenecaOnTheShortnessOfLifeHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_on_the_shortness_of_life_home);
        setTitle(this.getString(R.string.SenecaOnTheShortnessOfLifeTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter1();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter2();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter3();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter4();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter5();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter6();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter7();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter8();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter9();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter10();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter11();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter12();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter13();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter14();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter15();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter16();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_17);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter17();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_18);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter18();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_19);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter19();
            }
        });

        button = findViewById(R.id.seneca_on_the_shortness_of_life_chapter_20);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheShortnessofLifeChapter20();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void SenecaOnTheShortnessofLifeChapter1() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_1.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter2() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_2.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter3() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_3.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter4() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_4.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter5() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_5.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter6() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_6.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter7() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_7.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter8() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_8.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter9() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_9.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter10() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_10.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter11() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_11.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter12() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_12.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter13() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_13.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter14() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_14.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter15() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_15.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter16() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_16.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter17() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_17.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter18() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_18.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter19() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_19.class);
        startActivity(intent);
    }

    public void SenecaOnTheShortnessofLifeChapter20() {
        Intent intent = new Intent(this, SenecaOnTheShortnessOfLife_20.class);
        startActivity(intent);
    }

}