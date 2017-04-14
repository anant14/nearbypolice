package com.c1.nearbypolice.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.c1.nearbypolice.Model.Police;
import com.c1.nearbypolice.Model.PoliceList;
import com.c1.nearbypolice.R;
import com.c1.nearbypolice.Rest.policClient;
import com.c1.nearbypolice.policeAdapter.policeAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Police> singlePoliceArrayList;
    policeAdapter PoliceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singlePoliceArrayList = new ArrayList<>();
        PoliceAdapter = new policeAdapter(singlePoliceArrayList);

        policClient thePoliceDbApi = new policClient();

        thePoliceDbApi.getClient().getList().enqueue(new Callback<PoliceList>() {
            @Override
            public void onResponse(Call<PoliceList> call, Response<PoliceList> response) {
                for (Police singlePolice : response.body().getresults()){
                    Log.e("Movie",singlePolice.getName());
                    singlePoliceArrayList.add(singlePolice);
                }
                PoliceAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<PoliceList> call, Throwable t) {

            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvpolice);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(PoliceAdapter);
    }
}
