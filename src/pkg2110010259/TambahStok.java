/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010259;

import java.util.Date;

/**
 *
 * @author mal
 */
public class TambahStok {
    public static void main(String[] args){
        
    }
    private int idTambahStok;
    private Date tgl;
    private String kodeBarang;
    private int jumlah;

    public TambahStok(int idTambahStok, Date tgl, String kodeBarang, int jumlah) {
        this.idTambahStok = idTambahStok;
        this.tgl = tgl;
        this.kodeBarang = kodeBarang;
        this.jumlah = jumlah;
    }

    public int getIdTambahStok() {
        return idTambahStok;
    }

    public Date getTanggal() {
        return tgl;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setIdTambahStok(int idTambahStok) {
        this.idTambahStok = idTambahStok;
    }

    public void setTanggal(Date tgl) {
        this.tgl = tgl;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

