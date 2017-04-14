package com.c1.nearbypolice.policeAdapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.c1.nearbypolice.Model.Police;
import com.c1.nearbypolice.R;

import java.util.ArrayList;

/**
 * Created by anant bansal on 4/13/2017.
 */

public class policeAdapter extends RecyclerView.Adapter<policeAdapter.ViewHolder> {

    private ArrayList<Police> police;

    public policeAdapter(ArrayList<Police> singlePoliceArrayList) {police=singlePoliceArrayList;}

    @Override
    public policeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater lf=LayoutInflater.from(parent.getContext());
        View v=lf.inflate(R.layout.display,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(policeAdapter.ViewHolder holder, int position) {
        holder.textView1.setText(police.get(position).getName());
        holder.textView2.setText(police.get(position).getVicinity());
        holder.textView3.setText(police.get(position).getPlace_id());
    }

    @Override
    public int getItemCount() {
        return police.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;
        TextView textView2;
        TextView textView3;

        public ViewHolder(View itemView) {
            super(itemView);
            textView1 = (TextView) itemView.findViewById(R.id.Textview);
            textView2= (TextView) itemView.findViewById(R.id.Textview2);
            textView3= (TextView) itemView.findViewById(R.id.Textview3);
        }
    }
}
