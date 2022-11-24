package com.example.myothercatalog;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;

public class DinosaurioViewHolder  extends RecyclerView.ViewHolder{
    private final TextView textView;
    private final ImageView imageView;

    public DinosaurioViewHolder(@NonNull View itemView){
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.tvdinosaurio);
        imageView=(ImageView) itemView.findViewById(R.id.ivdinosaurio);
    }
    public void showData(DinosaurioData data, Activity activity){
        textView.setText(data.getName());
        ImageRequest request =  new ImageRequest(data.getImageUrl(),new Response.Listener<Bitmap>(){

            @Override
            public void onResponse(Bitmap response) {
                imageView.setImageBitmap(response);
            }
        },200, 200, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        
        RequestQueue cola = Volley.newRequestQueue(this.imageView.getContext());
        cola.add(request);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, DetailActivity.class);
                activity.startActivity(intent);
            }
        });
    }
}
