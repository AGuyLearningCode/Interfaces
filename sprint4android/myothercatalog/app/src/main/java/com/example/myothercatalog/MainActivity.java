package com.example.myothercatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView dinosaurioRecyclerView = (RecyclerView)findViewById(R.id.rvdinosaurio);
        dinosaurioRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        JsonArrayRequest request = new JsonArrayRequest(
        Request.Method.GET,"https://raw.githubusercontent.com/rubenmv0/fp/main/catalog.json",null,
                new Response.Listener<JSONArray>(){
                    @Override
                    public void onResponse(JSONArray response) {
                        List<DinosaurioData> dinosaurios=new ArrayList();
                        for (int i=0;i<response.length();i++){
                            try{
                                JSONObject dinosaurio = response.getJSONObject(i);
                                DinosaurioData data = new DinosaurioData(dinosaurio);
                                dinosaurios.add(data);
                            }catch(JSONException e){
                                e.printStackTrace();
                            }
                        }

                        DinosaurioAdapter dinosaurioAdapter = new DinosaurioAdapter(dinosaurios, MainActivity.this);
                        dinosaurioRecyclerView.setAdapter(dinosaurioAdapter);

                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Fallo", "Fallo en la peticion");
                    }
                });

        RequestQueue cola = Volley.newRequestQueue(this);
        cola.add(request);

    }
}