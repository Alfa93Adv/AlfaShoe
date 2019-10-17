package com.example.alfashoes.activities;

import android.os.Parcel;
import android.os.Parcelable;

public class HasilResult implements Parcelable {
    String NamaSepatu;
    String Warna;
    String Ukuran;
    String Nama;
    String Alamat;
    String No;

    public HasilResult(String namaSepatu, String warna, String ukuran, String nama, String alamat, String no) {
        NamaSepatu = namaSepatu;
        Warna = warna;
        Ukuran = ukuran;
        Nama = nama;
        Alamat = alamat;
        No = no;
    }

    protected HasilResult(Parcel in) {
        NamaSepatu = in.readString();
        Warna = in.readString();
        Ukuran = in.readString();
        Nama = in.readString();
        Alamat = in.readString();
        No = in.readString();
    }

    public static final Creator<HasilResult> CREATOR = new Creator<HasilResult>() {
        @Override
        public HasilResult createFromParcel(Parcel in) {
            return new HasilResult(in);
        }

        @Override
        public HasilResult[] newArray(int size) {
            return new HasilResult[size];
        }
    };

    public String getNamaSepatu() {
        return NamaSepatu;
    }

    public void setNamaSepatu(String namaSepatu) {
        NamaSepatu = namaSepatu;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public void setUkuran(String ukuran) {
        Ukuran = ukuran;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(NamaSepatu);
        parcel.writeString(Warna);
        parcel.writeString(Ukuran);
        parcel.writeString(Nama);
        parcel.writeString(Alamat);
        parcel.writeString(No);
    }
}
