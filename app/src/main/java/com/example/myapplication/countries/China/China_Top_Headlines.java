package com.example.myapplication.countries.China;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication.Adapter;
import com.example.myapplication.ApiClient;
import com.example.myapplication.Model.Articles;
import com.example.myapplication.Model.Headlines;
import com.example.myapplication.R;
import com.example.myapplication.countries.Canada.CanadaBusiness;
import com.example.myapplication.countries.Canada.CanadaEntertainment;
import com.example.myapplication.countries.Canada.CanadaHealth;
import com.example.myapplication.countries.Canada.CanadaScience;
import com.example.myapplication.countries.Canada.CanadaSports;
import com.example.myapplication.countries.Canada.CanadaTechnology;
import com.example.myapplication.countries.Canada.Canada_Top_Headlines;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class China_Top_Headlines extends AppCompatActivity {

    RecyclerView recyclerView;
    SwipeRefreshLayout swipeRefreshLayout;
    EditText etQuery;
    Button btnSearch;
    final String API_KEY = "0f9361857b1a4da09923dfaf16aa58de";
    Adapter adapter;
    List<Articles> articles = new ArrayList<>();

    private  String [] category={"---Select---","Business","Entertainment","Health","Science","Sports","Technology"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china__top__headlines);


        final Spinner sp=(Spinner) findViewById(R.id.China_Top_headline_Spinner);
        swipeRefreshLayout = findViewById(R.id.China_Top_headline_swipeRefresh);
        recyclerView = findViewById(R.id.China_Top_headline_recyclerView);
        etQuery = findViewById(R.id.China_Top_headline_etQuery);
        btnSearch = findViewById(R.id.China_Top_headline_btnSearch);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final String country = getCountry();

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                retrieveJson("",country,API_KEY);
            }
        });
        retrieveJson("",country,API_KEY);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etQuery.getText().toString().equals("")){
                    swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                        @Override
                        public void onRefresh() {
                            retrieveJson(etQuery.getText().toString(),country,API_KEY);
                        }
                    });
                    retrieveJson(etQuery.getText().toString(),country,API_KEY);
                }else{
                    swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                        @Override
                        public void onRefresh() {
                            retrieveJson("",country,API_KEY);
                        }
                    });
                    retrieveJson("",country,API_KEY);
                }
            }
        });


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,category);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if ( i == 0)
                {

                }
                if ( i == 1)
                {
                    startActivity(new Intent(getApplicationContext(), ChinaBusiness.class));
                }
                if ( i == 2)
                {
                    startActivity(new Intent(getApplicationContext(), ChinaEntertainment.class));
                }
                if ( i == 3)
                {
                    startActivity(new Intent(getApplicationContext(), ChinaHealth.class));
                }
                if ( i == 4)
                {
                    startActivity(new Intent(getApplicationContext(), ChinaScience.class));
                }
                if ( i == 5)
                {
                    startActivity(new Intent(getApplicationContext(), ChinaSports.class));
                }
                if ( i == 6)
                {
                    startActivity(new Intent(getApplicationContext(), ChinaTechnology.class));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void retrieveJson(String query ,String country , String apiKey){


        swipeRefreshLayout.setRefreshing(true);
        Call<Headlines> call;
        if (!etQuery.getText().toString().equals("")){
            call= ApiClient.getInstance().getApi().getSpecificData(query,apiKey);
        }else{
            call= ApiClient.getInstance().getApi().getHeadlines("cn",apiKey);
        }

        call.enqueue(new Callback<Headlines>() {
            @Override
            public void onResponse(Call<Headlines> call, Response<Headlines> response) {
                if (response.isSuccessful() && response.body().getArticles() != null){
                    swipeRefreshLayout.setRefreshing(false);
                    articles.clear();
                    articles = response.body().getArticles();
                    adapter = new Adapter(China_Top_Headlines.this,articles);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Headlines> call, Throwable t) {
                swipeRefreshLayout.setRefreshing(false);
                Toast.makeText(China_Top_Headlines.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public String getCountry(){
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        return country.toLowerCase();
    }
}