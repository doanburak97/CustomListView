package com.doanburak.customlistview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.doanburak.customlistview.R;
import com.doanburak.customlistview.models.Car;

import java.util.ArrayList;

public class CarAdapter extends BaseAdapter {

    private ArrayList<Car> CarList;
    private Context context;
    private LayoutInflater layoutInflater;

    TextView tv_brand, tv_model, tv_year, tv_price;
    ImageView iv_image;

    public CarAdapter(Context context, ArrayList<Car> CarList){
        this.context = context;
        this.CarList = CarList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return CarList.size();
    }

    @Override
    public Object getItem(int position) {
        return CarList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View customView = layoutInflater.inflate(R.layout.listview_row, null);

        tv_brand = customView.findViewById(R.id.tv_brand);
        tv_model = customView.findViewById(R.id.tv_model);
        tv_price = customView.findViewById(R.id.tv_price);
        tv_year = customView.findViewById(R.id.tv_year);
        iv_image = customView.findViewById(R.id.iv_image);

        iv_image.setImageResource(CarList.get(position).getImage());
        tv_brand.setText(CarList.get(position).getBrand());
        tv_model.setText(CarList.get(position).getModel());
        tv_year.setText(String.valueOf(CarList.get(position).getYear()));
        tv_price.setText(String.valueOf(CarList.get(position).getPrice()));

        return customView;
    }
}
