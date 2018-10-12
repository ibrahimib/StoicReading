package app.reading.stoic.stoicreading.SenecaOnTheFirmnessOfTheWiseMan;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.reading.stoic.stoicreading.R;

public class SenecaOnTheFirmnessOfTheWiseManHome extends AppCompatActivity {
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
        setContentView(R.layout.activity_seneca_on_the_firmness_of_the_wise_man_home);
        setTitle(this.getString(R.string.SenecaOnTheFirmnessOfTheWiseManTitle));

        //Call each activity when click corresponding button
        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter1();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter2();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter3();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter4();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter5();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter6();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter7();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter8();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter9();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter10();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter11();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter12();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter13();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter14();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter15();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter16();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_17);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter17();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_18);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter18();
            }
        });

        button = findViewById(R.id.seneca_on_the_firmness_of_the_wise_man_19);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SenecaOnTheFirmnessOfTheWiseManChapter19();
            }
        });
    }

    //Activity call methods, called by buttons above
    public void SenecaOnTheFirmnessOfTheWiseManChapter1() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_1.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter2() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_2.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter3() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_3.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter4() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_4.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter5() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_5.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter6() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_6.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter7() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_7.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter8() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_8.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter9() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_9.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter10() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_10.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter11() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_11.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter12() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_12.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter13() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_13.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter14() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_14.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter15() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_15.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter16() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_16.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter17() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_17.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter18() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_18.class);
        startActivity(intent);
    }

    public void SenecaOnTheFirmnessOfTheWiseManChapter19() {
        Intent intent = new Intent(this, SenecaOnTheFirmnessOfTheWiseMan_19.class);
        startActivity(intent);
    }

}