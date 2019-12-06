package com.example.pronojitmallick.mybookbuddyapp;

/**
 * Created by Pronojit Mallick on 24-May-17.
 */
public class DataModel {
    String name, version;
    int id_, image;

    public DataModel(String name, String version, int id_, int image) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getId_() {
        return id_;
    }

    public int getImage() {
        return image;
    }
}
