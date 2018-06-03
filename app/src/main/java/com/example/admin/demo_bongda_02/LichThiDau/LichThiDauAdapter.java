package com.example.admin.demo_bongda_02.LichThiDau;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.demo_bongda_02.R;

import java.util.ArrayList;

/**
 * Created by Admin on 01/06/2018.
 */

public class LichThiDauAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<LichThiDau> listLichThiDau;

    public LichThiDauAdapter(Context context, int layout, ArrayList<LichThiDau> listLichThiDau) {
        this.context = context;
        this.layout = layout;
        this.listLichThiDau = listLichThiDau;
    }

    @Override
    public int getCount() {
        return listLichThiDau.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    private class ViewHolder {
        TextView txtSTT, txtVong, txtThoiGian, txtTrangThai, txtDoiA, txtTiSo, txtDoiB;
        ImageView imgEdit, imgDelete;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(layout, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.txtSTT = (TextView) convertView.findViewById(R.id.txt_stt_listLTD);
            viewHolder.txtVong = (TextView) convertView.findViewById(R.id.txt_vong_listLTD);
            viewHolder.txtThoiGian = (TextView) convertView.findViewById(R.id.txt_tgian_listLTD);
            viewHolder.txtTrangThai = (TextView) convertView.findViewById(R.id.txt_trangthai_listLTD);
            viewHolder.txtDoiA = (TextView) convertView.findViewById(R.id.txt_doiA_listLTD);
            viewHolder.txtTiSo = (TextView) convertView.findViewById(R.id.txt_tiso_listLTD);
            viewHolder.txtDoiB = (TextView) convertView.findViewById(R.id.txt_doiB_listLTD);
            viewHolder.imgEdit = (ImageView) convertView.findViewById(R.id.img_edit);
            viewHolder.imgDelete = (ImageView) convertView.findViewById(R.id.img_delete);


            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        LichThiDau lichThiDau = listLichThiDau.get(position);
        viewHolder.txtSTT.setText(lichThiDau.getStt()+"");
        viewHolder.txtVong.setText("Vòng " + lichThiDau.getVong());
        viewHolder.txtThoiGian.setText(lichThiDau.getThoiGian());
        viewHolder.txtTrangThai.setText(lichThiDau.getTrangThai());
        viewHolder.txtDoiA.setText(lichThiDau.getDoiA());
        viewHolder.txtTiSo.setText(lichThiDau.getTiSo());
        viewHolder.txtDoiB.setText(lichThiDau.getDoiB());

        if(lichThiDau.getTrangThai().equals("Kết thúc hiệp 2")){
            viewHolder.txtTrangThai.setBackgroundResource(R.color.ketthuchiep2);
        }else{
            viewHolder.txtTrangThai.setBackgroundResource(R.color.chuabatdau);
        }

        viewHolder.imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Edit", Toast.LENGTH_SHORT).show();

            }
        });

        viewHolder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Delete", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
