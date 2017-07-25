package com.example.dell.pertemuan6.model;

import java.util.Arrays;

/**
 * Created by dell on 10/05/2017.
 */

public class DataItem {

    public String nomerSoal;
    public String soal;


    public DataItem() {
    }

    public DataItem(String nomerSoal, String soal) {
        this.nomerSoal = nomerSoal;
        this.soal = soal;

    }

    public String getNomerSoal() {
        return nomerSoal;
    }

    public void setNomerSoal(String nomerSoal) {
        this.nomerSoal = nomerSoal;
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }



    @Override
    public String toString() {
        return "SoalUjian{" +
                "nomerSoal='" + nomerSoal + '\'' +
                ", soal='" + soal + '\'' +
                '}';
    }
}
