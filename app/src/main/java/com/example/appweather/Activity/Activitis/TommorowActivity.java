package com.example.appweather.Activity.Activitis;

import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appweather.Activity.Adapter.TommorowAdapter;
import com.example.appweather.Activity.Domains.TommorowDomain;
import com.example.appweather.R;

import java.util.ArrayList;

public class TommorowActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTommorow;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_tommorow);

        initRecycleView();
        setVariable();
    }

    private void setVariable() {
        ConstraintLayout backBtn=findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> startActivity(new Intent(TommorowActivity.this, MainActivity.class)));
    }

    private void initRecycleView() {
        ArrayList<TommorowDomain> items = new ArrayList<>();

        items.add(new TommorowDomain("Середа", "cloudy", "Хмарно", 19,18));
        items.add(new TommorowDomain("Четверг", "storm", "Буря", 18,15));
        items.add(new TommorowDomain("Пятниця", "rainy", "Дощ", 19,16));
        items.add(new TommorowDomain("Субота", "sun", "Сонячно", 20,19));
        items.add(new TommorowDomain("Неділя", "sun", "Сонячно", 22,20));
        items.add(new TommorowDomain("Понеділок", "cloudy", "Хмарно", 21,18));


        recyclerView=findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        adapterTommorow=new TommorowAdapter(items);
        recyclerView.setAdapter(adapterTommorow);
    }
}
