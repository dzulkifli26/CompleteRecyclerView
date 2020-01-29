package com.dzu.adidasbestcollection.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Adidas implements Parcelable {

    // create implementation Parcelable to this class
    private String name;
    private String elevation;
    private String photo;
    private String description;
    private String location;
    private String size1;
    private String spec;

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getSize() {
        return size1;
    }

    public void setSize(String size) {
        this.size1 = size;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Adidas() {
    }

    protected Adidas(Parcel in) {
        name = in.readString();
        elevation = in.readString();
        photo = in.readString();
        description = in.readString();
        location = in.readString();
        size1 = in.readString();
        spec = in.readString();
    }

    public static final Creator<Adidas> CREATOR = new Creator<Adidas>() {
        @Override
        public Adidas createFromParcel(Parcel in) {
            return new Adidas(in);
        }

        @Override
        public Adidas[] newArray(int size) {
            return new Adidas[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(elevation);
        parcel.writeString(photo);
        parcel.writeString(description);
        parcel.writeString(location);
        parcel.writeString(size1);
        parcel.writeString(spec);
    }

}
