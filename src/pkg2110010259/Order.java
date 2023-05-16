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
public class Order {
    public static void main(String[] args){
        
    }
    private int id_Order;
    private Date tanggal;
    private String kode_Bioskop;
    private String kodeBrng;
    private int jumlah;
    private String Ket;
    private String status;

    public Order(int id_Order, Date tanggal, String kode_Bioskop, String kodeBrng, int jumlah, String Ket, String status) {
        this.id_Order = id_Order;
        this.tanggal = tanggal;
        this.kode_Bioskop = kode_Bioskop;
        this.kodeBrng = kodeBrng;
        this.jumlah = jumlah;
        this.Ket = Ket;
        this.status = status;
    }

    public int getIdOrder() {
        return id_Order;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public String getKodeBioskop() {
        return kode_Bioskop;
    }

    public String getKodeBarang() {
        return kodeBrng;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getKeterangan() {
        return Ket;
    }

    public String getStatus() {
        return status;
    }

    public void setIdOrder(int id_Order) {
        this.id_Order = id_Order;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public void setKodeBioskop(String kode_Bioskop) {
        this.kode_Bioskop = kode_Bioskop;
    }

    public void setKodeBarang(String kodeBrng) {
        this.kodeBrng = kodeBrng;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setKeterangan(String Ket) {
        this.Ket = Ket;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
