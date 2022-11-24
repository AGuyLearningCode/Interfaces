package com.example.myothercatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String descripcion = intent.getStringExtra("descripcion");
        String url = intent.getStringExtra("url");
        TextView textViewTitulo =(TextView) findViewById(R.id.títuloDinosaurio);
        TextView textViewDescripcion =(TextView) findViewById(R.id.DescripciónDinosaurio);
        ImageView imagen = (ImageView) findViewById(R.id.ImagenDinosaurio);
        textViewTitulo.setText(nombre);
        textViewDescripcion.setText(descripcion);

        ImageRequest request =  new ImageRequest(url,new Response.Listener<Bitmap>(){

            @Override
            public void onResponse(Bitmap response) {
                imagen.setImageBitmap(response);
            }
        },200, 200, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue cola = Volley.newRequestQueue(this);
        cola.add(request);

    }
}