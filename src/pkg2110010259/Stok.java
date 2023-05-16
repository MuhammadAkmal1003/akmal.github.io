/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010259;

/**
 *
 * @author mal
 */
public class Stok {
    public static void main(String[] args){
        
    }
    public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int jumlah;
    private String satuan;

    public Barang(String kodeBarang, String namaBarang, int jumlah, String satuan) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.satuan = satuan;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public void tambahJumlah(int jumlah) {
        this.jumlah += jumlah;
    }

    public void kurangiJumlah(int jumlah) {
        this.jumlah -= jumlah;
    }

    }
}