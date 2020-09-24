package com.example.wallpaperapp.model;

public class ImageModel {
    private String mediumUrl, originalURl;
    private int id;

    public ImageModel() {
    }

    public ImageModel(String mediumUrl, String originalURl, int id) {
        this.mediumUrl = mediumUrl;
        this.originalURl = originalURl;
        this.id = id;
    }

    public String getMediumUrl() {
        return mediumUrl;
    }

    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }

    public String getOriginalURl() {
        return originalURl;
    }

    public void setOriginalURl(String originalURl) {
        this.originalURl = originalURl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
