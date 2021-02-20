package com.doanburak.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.doanburak.customlistview.adapters.CarAdapter;
import com.doanburak.customlistview.models.Car;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Car> CarList = new ArrayList<>();

    ListView lv_carList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_carList = findViewById(R.id.lv_carList);

        Car car1 = new Car("Brand","Model",2020,150000,R.drawable.seat);
        Car car2 = new Car("Brand2","Model2",2021,160000,R.drawable.skoda);
        Car car3 = new Car("Brand3","Model3",2022,170000,R.drawable.vw);
        Car car4 = new Car("Brand4","Model4",2023,180000,R.drawable.volvo);

        CarList.add(car1);
        CarList.add(car2);
        CarList.add(car3);
        CarList.add(car4);

        CarAdapter carAdapter = new CarAdapter(this, CarList);
        lv_carList.setAdapter(carAdapter);
    }
}