package com.example.myothercatalog;

import org.json.JSONException;
import org.json.JSONObject;

public class DinosaurioData {
    private String name;
    private String description;
    private String imageUrl;

    public DinosaurioData(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public DinosaurioData(JSONObject jsonObject) throws JSONException {
        this.name = jsonObject.getString("name");
        this.description = jsonObject.getString("description");
        this.imageUrl = jsonObject.getString("image_url");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
