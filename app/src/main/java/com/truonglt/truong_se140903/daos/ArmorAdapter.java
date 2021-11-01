package com.truonglt.truong_se140903.daos;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.truonglt.truong_se140903.R;
import com.truonglt.truong_se140903.dtos.ArmorDTO;

import java.util.List;

public class ArmorAdapter extends BaseAdapter {
    private List<ArmorDTO> listArmor;
    public ArmorAdapter() {
    }

    public List<ArmorDTO> getListFood() {
        return listArmor;
    }

    public void setListWeapon(List<ArmorDTO> listArmor) {
        this.listArmor = listArmor;
    }

    @Override
    public int getCount() {
        return listArmor.size();
    }

    @Override
    public Object getItem(int i) {
        return listArmor.get(i);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView== null){
            LayoutInflater inflater= LayoutInflater.from(parent.getContext());
            convertView =  inflater.inflate(R.layout.armor, parent, false);
        }

        TextView txtID = convertView.findViewById(R.id.txtID);
        TextView txtClassification = convertView.findViewById(R.id.txtClassification);
        TextView txtDefense =  convertView.findViewById(R.id.txtDefense);
        ArmorDTO dto= listArmor.get(position);
        txtID.setText("ID: "+dto.getArmorId());
        txtClassification.setText("Classification: "+dto.getClassification());
        txtDefense.setText("Defense: "+dto.getDefense()+"");
        return convertView;
    }

}
