package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.countries.Argentina.ArgentinaTop_headlines;
import com.example.myapplication.countries.Australia.AustraliaTop_Healdines;
import com.example.myapplication.countries.Austria.Austria_Top_Headlines;
import com.example.myapplication.countries.Belgium.Belgium_Top_Headlines;
import com.example.myapplication.countries.Brazil.Brazil_Top_Headlines;
import com.example.myapplication.countries.Bulgaria.Bulgaria_Top_Headlines;
import com.example.myapplication.countries.Canada.Canada_Top_Headlines;
import com.example.myapplication.countries.China.China_Top_Headlines;
import com.example.myapplication.countries.Colombia.Colombia_Top_Headlines;
import com.example.myapplication.countries.Cuba.Cuba_Top_Headlines;
import com.example.myapplication.countries.CzechRepublic.Czech_Top_Headlines;
import com.example.myapplication.countries.Egypt.Egypt_Top_Headlines;
import com.example.myapplication.countries.France.France_Top_Headlines;
import com.example.myapplication.countries.Germany.Germany_Top_Headlines;
import com.example.myapplication.countries.Greece.Greece_Top_Headlines;
import com.example.myapplication.countries.HKong.HKong_Top_Headlines;
import com.example.myapplication.countries.Hungary.Hungary_Top_Headlines;
import com.example.myapplication.countries.India.India_Top_Headlines;
import com.example.myapplication.countries.Indonesia.Indonesia_Top_Headlines;
import com.example.myapplication.countries.Ireland.Ireland_Top_Headlines;
import com.example.myapplication.countries.Isreal.Isreal_Top_Headlines;
import com.example.myapplication.countries.Itlay.Itlay_Top_Headlines;
import com.example.myapplication.countries.Japan.Japan_Top_Headlines;
import com.example.myapplication.countries.Lativa.Lativa_Top_Headlines;
import com.example.myapplication.countries.Lithuania.Lithuania_Top_Headlines;
import com.example.myapplication.countries.Malaysia.Malaysia_Top_Headlines;
import com.example.myapplication.countries.Mexico.Mexico_Top_Headlines;
import com.example.myapplication.countries.Morocco.Morocco_Top_Headlines;
import com.example.myapplication.countries.Netherland.Netherland_Top_Headlines;
import com.example.myapplication.countries.NewZealand.NewZealand_Top_Headlines;
import com.example.myapplication.countries.Nigeria.Nigeria_Top_Headlines;
import com.example.myapplication.countries.Norway.Norway_Top_Headlines;
import com.example.myapplication.countries.Philiphpines.Philiphpines_Top_Headlines;
import com.example.myapplication.countries.Poland.Poland_Top_Headlines;
import com.example.myapplication.countries.Portugal.Portugal_Top_Headlines;
import com.example.myapplication.countries.Romania.Romania_Top_Headlines;
import com.example.myapplication.countries.Russia.Russia_Top_Headlines;
import com.example.myapplication.countries.SaudiaArabia.SaudiaArabia_Top_Headlines;
import com.example.myapplication.countries.Serbia.Serbia_Top_Headlines;
import com.example.myapplication.countries.Singapore.Singapore_Top_Headlines;
import com.example.myapplication.countries.Slovakia.Slovakia_Top_Headlines;
import com.example.myapplication.countries.Slovenia.Slovenia_Top_Headlines;
import com.example.myapplication.countries.SouthAfrica.SouthAfrica_Top_Headlines;
import com.example.myapplication.countries.SouthKorea.SouthKorea_Top_Headlines;
import com.example.myapplication.countries.Sweden.Sweden_Top_Headlines;
import com.example.myapplication.countries.Switzerland.Switzerland_Top_Headlines;
import com.example.myapplication.countries.Taiwan.Taiwan_Top_Headlines;
import com.example.myapplication.countries.Thailand.Thailand_Top_Headlines;
import com.example.myapplication.countries.Turkey.Turkey_Top_Headlines;
import com.example.myapplication.countries.UAE.UAE_Top_Headlines;
import com.example.myapplication.countries.UK.UK_Top_Headlines;
import com.example.myapplication.countries.US.US_Top_Headlines;
import com.example.myapplication.countries.Ukraina.Ukraina_Top_Headlines;
import com.example.myapplication.countries.Venuzuela.Venuzuela_Top_Headlines;

public class CountiresSelectionActivity extends AppCompatActivity {

    private CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34
            ,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countires_selection);

        c1 = findViewById(R.id.country1);
        c2 = findViewById(R.id.country2);
        c3 = findViewById(R.id.country3);
        c4 = findViewById(R.id.country4);
        c5 = findViewById(R.id.country5);
        c6 = findViewById(R.id.country6);
        c7 = findViewById(R.id.country7);
        c8 = findViewById(R.id.country8);
        c9 = findViewById(R.id.country9);
        c10 = findViewById(R.id.country10);
        c11 = findViewById(R.id.country11);
        c12 = findViewById(R.id.country12);
        c13 = findViewById(R.id.country13);
        c14 = findViewById(R.id.country14);
        c15 = findViewById(R.id.country15);
        c16 = findViewById(R.id.country16);
        c17 = findViewById(R.id.country17);
        c18 = findViewById(R.id.country18);
        c19 = findViewById(R.id.country19);
        c20 = findViewById(R.id.country20);
        c21 = findViewById(R.id.country21);
        c22 = findViewById(R.id.country22);
        c23 = findViewById(R.id.country23);
        c24 = findViewById(R.id.country24);
        c25 = findViewById(R.id.country25);
        c26 = findViewById(R.id.country26);
        c27 = findViewById(R.id.country27);
        c28 = findViewById(R.id.country28);
        c29 = findViewById(R.id.country29);
        c30 = findViewById(R.id.country30);
        c31 = findViewById(R.id.country31);
        c32 = findViewById(R.id.country32);
        c33 = findViewById(R.id.country33);
        c34 = findViewById(R.id.country34);
        c35 = findViewById(R.id.country35);
        c36 = findViewById(R.id.country36);
        c37 = findViewById(R.id.country37);
        c38 = findViewById(R.id.country38);
        c39 = findViewById(R.id.country39);
        c40 = findViewById(R.id.country40);
        c41 = findViewById(R.id.country41);
        c42 = findViewById(R.id.country42);
        c43 = findViewById(R.id.country43);
        c44 = findViewById(R.id.country44);
        c45 = findViewById(R.id.country45);
        c46 = findViewById(R.id.country46);
        c47 = findViewById(R.id.country47);
        c48 = findViewById(R.id.country48);
        c49 = findViewById(R.id.country49);
        c50 = findViewById(R.id.country50);
        c51 = findViewById(R.id.country51);
        c52 = findViewById(R.id.country52);
        c53 = findViewById(R.id.country53);
        c54 = findViewById(R.id.country54);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ArgentinaTop_headlines.class));

            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AustraliaTop_Healdines.class));

            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Austria_Top_Headlines.class));

            }
        });


        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Belgium_Top_Headlines.class));

            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Brazil_Top_Headlines.class));

            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Bulgaria_Top_Headlines.class));

            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Canada_Top_Headlines.class));

            }
        });

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), China_Top_Headlines.class));

            }
        });

        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Colombia_Top_Headlines.class));

            }
        });

        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Cuba_Top_Headlines.class));

            }
        });

        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Czech_Top_Headlines.class));

            }
        });

        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Egypt_Top_Headlines.class));

            }
        });

        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), France_Top_Headlines.class));

            }
        });

        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Germany_Top_Headlines.class));

            }
        });

        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Greece_Top_Headlines.class));

            }
        });

        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), HKong_Top_Headlines.class));

            }
        });

        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Hungary_Top_Headlines.class));

            }
        });

        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), India_Top_Headlines.class));

            }
        });

        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Indonesia_Top_Headlines.class));

            }
        });

        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Ireland_Top_Headlines.class));

            }
        });

        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Isreal_Top_Headlines.class));

            }
        });

        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Itlay_Top_Headlines.class));

            }
        });

        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Japan_Top_Headlines.class));

            }
        });

        c24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Lativa_Top_Headlines.class));

            }
        });
        c25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Lithuania_Top_Headlines.class));

            }
        });

        c26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Malaysia_Top_Headlines.class));

            }
        });

        c27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Mexico_Top_Headlines.class));

            }
        });

        c28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Morocco_Top_Headlines.class));

            }
        });

        c29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Netherland_Top_Headlines.class));

            }
        });

        c30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NewZealand_Top_Headlines.class));

            }
        });

        c31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Nigeria_Top_Headlines.class));

            }
        });

        c32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Norway_Top_Headlines.class));

            }
        });

        c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Philiphpines_Top_Headlines.class));

            }
        });

        c34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Poland_Top_Headlines.class));

            }
        });

        c35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Portugal_Top_Headlines.class));

            }
        });

        c36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Romania_Top_Headlines.class));

            }
        });

        c37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Russia_Top_Headlines.class));

            }
        });

        c38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SaudiaArabia_Top_Headlines.class));

            }
        });

        c39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Serbia_Top_Headlines.class));

            }
        });

        c40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Singapore_Top_Headlines.class));

            }
        });

        c41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Slovakia_Top_Headlines.class));

            }
        });

        c42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Slovenia_Top_Headlines.class));

            }
        });

        c43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SouthAfrica_Top_Headlines.class));

            }
        });

        c44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SouthKorea_Top_Headlines.class));

            }
        });

        c45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Sweden_Top_Headlines.class));

            }
        });

        c46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Switzerland_Top_Headlines.class));

            }
        });

        c47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Taiwan_Top_Headlines.class));

            }
        });

        c48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Thailand_Top_Headlines.class));

            }
        });

        c49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Turkey_Top_Headlines.class));

            }
        });

        c50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), UAE_Top_Headlines.class));

            }
        });

        c51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), UK_Top_Headlines.class));

            }
        });

        c52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Ukraina_Top_Headlines.class));

            }
        });

        c53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), US_Top_Headlines.class));

            }
        });

        c54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Venuzuela_Top_Headlines.class));

            }
        });
    }
}