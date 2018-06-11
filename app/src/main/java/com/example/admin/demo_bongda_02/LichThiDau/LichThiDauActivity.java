package com.example.admin.demo_bongda_02.LichThiDau;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.admin.demo_bongda_02.R;

import java.util.ArrayList;

public class LichThiDauActivity extends AppCompatActivity {

    ImageView imgMenu;

    ListView lstLichThiDau;
    ArrayList<LichThiDau> listLich;
    LichThiDauAdapter adapter;

    Spinner spinChonVong;
    ArrayList<String> listVongDau;
    ArrayAdapter adapterSpinVongDau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lich_thi_dau);

        imgMenu = (ImageView) findViewById(R.id.img_menu);


        lstLichThiDau = (ListView)findViewById(R.id.lst_LichThiDau);
        listLich = new ArrayList<>();
        listLich.add(new LichThiDau(1, 10, "17:00 - 20/10/2018", "Kết thúc hiệp 2", "HÀ NỘI", "1-0", "HẢI PHÒNG"));
        listLich.add(new LichThiDau(2, 10, "17:00 - 20/10/2018", "Kết thúc hiệp 2", "NAM ĐỊNH", "1-0", "FLC THANH HÓA"));
        listLich.add(new LichThiDau(3, 10, "17:00 - 20/10/2018", "Kết thúc hiệp 2", "TP HỒ CHÍ MINH", "3-4", "CLB QUẢNG NAM"));
        listLich.add(new LichThiDau(4, 10, "17:00 - 20/10/2018", "Kết thúc hiệp 2", "HOÀNG ANH GIA LAI", "1-2", "SÔNG LAM NGHỆ AN"));
        listLich.add(new LichThiDau(5, 10, "18:00 - 20/10/2018", "Chưa bắt đầu", "BECAMEX BÌNH DƯƠNG", "", "SÀI GÒN"));
        listLich.add(new LichThiDau(6, 10, "18:00 - 20/10/2018", "Chưa bắt đầu", "HÀ NỘI", "", "HẢI PHÒNG"));
        listLich.add(new LichThiDau(7, 10, "18:00 - 20/10/2018", "Chưa bắt đầu", "NAM ĐỊNH", "", "FLC THANH HÓA"));
        listLich.add(new LichThiDau(8, 10, "19:00 - 20/10/2018", "Chưa bắt đầu", "TP HỒ CHÍ MINH", "", "CLB QUẢNG NAM"));
        listLich.add(new LichThiDau(9, 10, "19:00 - 20/10/2018", "Chưa bắt đầu", "HOÀNG ANH GIA LAI", "", "SÔNG LAM NGHỆ AN"));
        listLich.add(new LichThiDau(10, 10, "19:00 - 20/10/2018", "Chưa bắt đầu", "BECAMEX BÌNH DƯƠNG", "", "SÀI GÒN"));

        adapter = new LichThiDauAdapter(this, R.layout.item_lichthidau, listLich);
        lstLichThiDau.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        spinChonVong = (Spinner)findViewById(R.id.spin_VongDau);


        listVongDau = new ArrayList<>();
        listVongDau.add("V League 2018 - Vòng 1");
        listVongDau.add("V League 2018 - Vòng 2");
        listVongDau.add("V League 2018 - Vòng 3");
        listVongDau.add("V League 2018 - Vòng 4");
        listVongDau.add("V League 2018 - Vòng 5");
        listVongDau.add("V League 2018 - Vòng 6");
        listVongDau.add("V League 2018 - Vòng 7");
        listVongDau.add("V League 2018 - Vòng 8");
        listVongDau.add("V League 2018 - Vòng 9");
        listVongDau.add("V League 2018 - Vòng 10");

        adapterSpinVongDau = new ArrayAdapter(this, R.layout.spinner_vongdau, listVongDau);
        adapterSpinVongDau.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinChonVong.setAdapter(adapterSpinVongDau);

        spinChonVong.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LichThiDauActivity.this, listVongDau.get(position), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
