package com.example.appdelogin.Clases;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {

    private String email;
    private String password;


    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }


    protected Usuario(Parcel in) {
        email = in.readString();
        password = in.readString();
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(email);
        parcel.writeString(password);
    }
}