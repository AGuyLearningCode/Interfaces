package com.example.myothercatalog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DinosaurioAdapter extends RecyclerView.Adapter<DinosaurioViewHolder>{
    private List<DinosaurioData> allTheData;
    private Activity activity;

    public DinosaurioAdapter(List<DinosaurioData> dataset, Activity activity){

        this.allTheData=dataset;
        this.activity=activity;

    }

    @NonNull
    @Override
    public DinosaurioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.celda_dinosaurio, parent, false);
        return new DinosaurioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DinosaurioViewHolder holder, int position) {
        DinosaurioData dinosaurioData = allTheData.get(position);
        holder.showData(dinosaurioData, activity);
    }

    @Override
    public int getItemCount() {
        return allTheData.size();
    }
}
