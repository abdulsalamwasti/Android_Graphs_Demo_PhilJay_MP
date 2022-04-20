package com.example.androidgraphs;

import static com.github.mikephil.charting.utils.ColorTemplate.COLORFUL_COLORS;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart barChart;
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barChart = findViewById(R.id.barchart);
        pieChart = findViewById(R.id.pichart);


        ArrayList<BarEntry> barEntries = new ArrayList<>();
        ArrayList<PieEntry> pieEntries = new ArrayList<>();


        for (int i =0; i<10; i++)
        {
            float v = (float) (i* 10.0);

            BarEntry barEntry = new BarEntry(i, v);
            PieEntry pieEntry = new PieEntry(i, v);

            barEntries.add(barEntry);
            pieEntries.add(pieEntry);
        }


        BarDataSet barDataSet = new BarDataSet(barEntries, "Wasti");
        barDataSet.setColors(COLORFUL_COLORS);
        barDataSet.setDrawValues(false);
        barChart.setData(new BarData(barDataSet));
        barChart.animateY(5000);
        barChart.getDescription().setText("Talha boi");
        barChart.getDescription().setTextColor(Color.BLUE);

        PieDataSet pieDataSet = new PieDataSet(pieEntries, "Taha");
        barDataSet.setColors(COLORFUL_COLORS);
        pieChart.setData(new PieData(pieDataSet));
        pieChart.animateXY(5000,5000);
        pieChart.getDescription().setEnabled(false);


    }
}